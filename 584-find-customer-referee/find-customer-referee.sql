# Write your MySQL query statement below
SELECT name FROM Customer WHERE Customer.referee_id IS NULL OR Customer.referee_id != 2;