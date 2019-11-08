USE `sportlib`;

SELECT p.id, p.place, p.name, a.id, a.activity, a.day 
FROM `sportlib`.`t_place` p, `sportlib`.`t_activity` a
WHERE p.id = a.place_id
AND   p.id = 1;