INSERT INTO INVOICE
VALUES(
    10983,
    '10010',
    '11-May-2018',
    '110.00',
    '30,
       ' OPEN ');
       
INSERT INTO LINE
VALUES (10983,
       1,
       ' 11 QER / 31 ',
       1,
       110.00);
       
UPDATE CUSTOMER
SET CUS_DATELSTPUR = ' 11 - May -2018 ',
CUS_BALANCE = CUS_BALANCE + 110.00
WHERE CUS_CODE = ' 10010 ';
COMMIT;
       
