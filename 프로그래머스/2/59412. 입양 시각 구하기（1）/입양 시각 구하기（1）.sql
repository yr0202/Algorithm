-- 코드를 입력하세요
SELECT hour(datetime) hour,count(*)
from ANIMAL_OUTS 
where hour(datetime) between 9 and 19
group by hour(DATETIME)
order by hour(datetime) asc;