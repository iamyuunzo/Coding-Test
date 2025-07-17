-- 코드를 입력하세요
SELECT FH.FLAVOR FROM FIRST_HALF FH
JOIN ICECREAM_INFO IC ON FH.FLAVOR = IC.FLAVOR
WHERE FH.TOTAL_ORDER > 3000
AND IC.INGREDIENT_TYPE = "fruit_based"
ORDER BY FH.TOTAL_ORDER DESC;

#아이스크림 상반기 주문 정보 : FIRST_HALF
#=> SHIPMENT_ID(출하 번호), FLAVOR(아이스크림 맛 = 기본키), TOTAL_ORDER (상반기 아이스크림 총주문량)

#아이스크림 성분 정보 : ICECREAM_INFO (위 테이블의 외래 키)
#=> FLAVOR(아이스크림 맛 = 기본키), INGREDITENT_TYPE (아이스크림의 성분 타입)
#=> 주 성분 : 설탕 (sugar_based), 과일 (fruit_based)