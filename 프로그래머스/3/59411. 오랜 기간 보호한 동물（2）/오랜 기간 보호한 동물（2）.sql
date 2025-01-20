-- 코드를 입력하세요
SELECT outs.ANIMAL_ID as ANIMAL_ID, outs.NAME
from animal_ins ins inner join animal_outs outs
where ins.animal_id = outs.animal_id
order by (outs.datetime - ins.datetime) desc
LIMIT 2