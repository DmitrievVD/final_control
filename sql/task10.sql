DELETE  FROM camels;

SELECT animal_name, birthday, сommands FROM horses
UNION SELECT  animal_name, birthday, сommands FROM donkeys;