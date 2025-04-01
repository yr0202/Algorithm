select name, datetime
from ANIMAL_INS
where animal_id not in(
    select i.animal_id
    from ANIMAL_INS i 
    join ANIMAL_OUTS o on i.animal_id = o.animal_id
    )
order by datetime 
limit 3