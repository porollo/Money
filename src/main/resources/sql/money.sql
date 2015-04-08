USE master
GO
CREATE DATABASE Money
GO
USE Money
CREATE TABLE water
(
	id			int			  NOT NULL,
	water_date  datetime	  NOT NULL,
	water_count int			  NOT NULL
)
CREATE TABLE electricity
(
	id  		      int		  NOT NULL,
	electricity_date  datetime	  NOT NULL,
	electricity_count int		  NOT NULL
)
GO
INSERT INTO water (id, water_date, water_count)
VALUES( 0, '2015-01-01 00:00:00', 0 )

INSERT INTO electricity (id, electricity_date, electricity_count)
VALUES( 0, '2015-01-01 00:00:00', 0 )
GO