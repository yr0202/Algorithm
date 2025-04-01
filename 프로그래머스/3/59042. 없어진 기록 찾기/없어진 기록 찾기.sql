select animal_id, name
from ANIMAL_OUTS o 
where o.animal_id not in (
    # 유실되지 않은 데이터
    select i.animal_id
    from ANIMAL_INS i
    join ANIMAL_OUTS o on i.animal_id = o.animal_id
    )
    
