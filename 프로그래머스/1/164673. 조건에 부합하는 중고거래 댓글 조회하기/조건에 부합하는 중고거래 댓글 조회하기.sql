-- 코드를 입력하세요
SELECT 
    BD.TITLE,                           
    BD.BOARD_ID,                      
    RP.REPLY_ID,                        
    RP.WRITER_ID,                       
    RP.CONTENTS,                        
    DATE_FORMAT(RP.CREATED_DATE, "%Y-%m-%d") AS CREATED_DATE  
FROM 
    USED_GOODS_BOARD AS BD           
JOIN 
    USED_GOODS_REPLY AS RP            
    ON BD.BOARD_ID = RP.BOARD_ID       
WHERE 
    BD.CREATED_DATE BETWEEN '2022-10-01' AND '2022-10-31'  
ORDER BY 
    RP.CREATED_DATE ASC,               
    BD.TITLE ASC;                      
