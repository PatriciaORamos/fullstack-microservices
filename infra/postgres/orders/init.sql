CREATE TABLE IF NOT EXISTS orders (id UUID PRIMARY KEY, customer_id UUID, status VARCHAR(32), total NUMERIC(12,2), created_at TIMESTAMP DEFAULT NOW());
CREATE TABLE IF NOT EXISTS order_items (id UUID PRIMARY KEY, order_id UUID REFERENCES orders(id) ON DELETE CASCADE, product_id UUID, qty INT, unit_price NUMERIC(12,2));
