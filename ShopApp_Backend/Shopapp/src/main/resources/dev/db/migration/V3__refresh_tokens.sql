SELECT COUNT(*)
INTO @columnCount
FROM INFORMATION_SCHEMA.COLUMNS
WHERE TABLE_NAME = 'tokens'
    AND TABLE_SCHEMA = 'shopapp'
    AND COLUMN_NAME = 'REFRESH_TOKEN';

SET @alterStatement = IF(@columnCount = 0, 'ALTER TABLE tokens ADD COLUMN REFRESH_TOKEN VARCHAR(255) DEFAULT '''';','');

PREPARE stmt FROM @alterStatement;
EXECUTE stmt;
DEALLOCATE PREPARE stmt;

SELECT COUNT(*)
INTO @columnCount
FROM INFORMATION_SCHEMA.COLUMNS
WHERE TABLE_NAME = 'tokens'
    AND TABLE_SCHEMA = 'shopapp'
    AND COLUMN_NAME = 'REFRESH_EXPIRATION_DATE';

SET @alterStatement = IF(@columnCount = 0, 'ALTER TABLE tokens ADD COLUMN REFRESH_EXPIRATION_DATE DATETIME;','');

PREPARE stmt FROM @alterStatement;
EXECUTE stmt;
DEALLOCATE PREPARE stmt;