select product_code, sum(price*sales_amount) as sales
from PRODUCT p
join OFFLINE_SALE o on p.product_id = o.product_id
group by p.product_id
order by sales desc, product_code