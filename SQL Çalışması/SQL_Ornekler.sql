SELECT ContactName Adi
	,CompanyName SirketAdi
	,City Sehir
FROM Customers

SELECT *
FROM Customers
WHERE City = 'ERZÝNCAN'

SELECT *
FROM Products
WHERE CategoryId = 1
	OR CategoryId = 3

SELECT *
FROM Products
WHERE CategoryId = 1
	AND UnitPrice >= 10

SELECT *
FROM Products
WHERE CategoryId = 1
ORDER BY UnitPrice DESC

SELECT count(*) Adet
FROM Products
WHERE CategoryId = 2

SELECT CategoryId
	,count(*)
FROM Products
WHERE UnitPrice > 20
GROUP BY CategoryID
HAVING count(*) < 10

SELECT Products.ProductID
	,Products.ProductName
	,Products.UnitPrice
	,Categories.CategoryName
FROM Products
INNER JOIN Categories ON Products.CategoryID = Categories.CategoryID
WHERE Products.UnitPrice > 10

--DTO means Data Transformation Object
SELECT *
FROM Products p
INNER JOIN [Order Details] od ON p.ProductID = od.ProductID
INNER JOIN Orders o ON o.OrderID = od.OrderID

SELECT *
FROM Customers c
LEFT JOIN Orders o ON c.CustomerID = o.CustomerID
WHERE o.CustomerID IS NULL
