USE `sportlib`;

INSERT INTO `sportlib`.`t_activity` (`id`, `activity`, `date_activity`, `day`, `end_time`, `start_time`, `place_id`) 
VALUES (1, 'AquaGym', '2019-10-09', 'Vendredi', '19:00', '17:00', 1);

INSERT INTO `sportlib`.`t_activity` (`id`, `activity`, `date_activity`, `day`, `end_time`, `start_time`, `place_id`) 
VALUES (2, 'AquaBike', '2019-10-09', 'Jeudi', '20:00', '17:00', 1);

INSERT INTO `sportlib`.`t_activity` (`id`, `activity`, `date_activity`, `day`, `end_time`, `start_time`, `place_id`) 
VALUES (3, 'Water-Polo', '2019-10-09', 'Mercredi', '22:00', '19:00', 1);

INSERT INTO `sportlib`.`t_activity` (`id`, `activity`, `date_activity`, `day`, `end_time`, `start_time`, `place_id`) 
VALUES (4, 'Natation Synchronisée', '2019-10-09', 'Lundi', '20:00', '17:00', 2);

SELECT * FROM `sportlib`.`t_activity`
WHERE `t_activity`.`place_id` = 1;