USE `sportlib`;

INSERT INTO `sportlib`.`t_place` (`id`, `address`, `city`, `date_place`, `phone`, `image`, `name`, `overture`, `place`, `zip_code`) 
VALUES (
1, 
'5-7 rue Serpollet', 
'Paris', 
'2019-10-10',
'0148877056', 
'https://www.caue75.fr/media/cache/caueidf_article_main/uploads/media/caueidf/0001/06/xe48b627f2d67d1b1454de612d1264836.jpg.pagespeed.ic.geZw4YFhsh.webp',
 'Yvonne Godard', 
 'Du Lundi au Vendredi\nde 09h00 à 22h00', 
 'Piscine', 
 '75020');
 
INSERT INTO `sportlib`.`t_place` (`id`, `address`, `city`, `date_place`, `phone`, `image`, `name`, `overture`, `place`, `zip_code`) 
VALUES (
2,
"4-12 rue Dénoyez",
"Paris",
"2019-10-24",
"0158535780",
"https://s3-media2.fl.yelpcdn.com/bphoto/X5aRn0YCjJoCwWPzfUtiUQ/o.jpg",
"Alfred Nakache",
"Lundi au Dimanche\nde 08h00 à 22h00",
"Piscine",
"75020");
 
SELECT * FROM `sportlib`.`t_place`;