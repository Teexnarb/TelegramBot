CREATE TABLE notification_task
(
    id SERIAL PRIMARY KEY,
    chat_id BIGINT,
    text_message TEXT,
    sending_time TIMESTAMP
);