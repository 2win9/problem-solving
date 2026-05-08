-- 코드를 입력하세요
SELECT DISTINCT(CAR_ID),
    CASE
        WHEN CAR_ID IN (
            SELECT CAR_ID
            FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
            WHERE '2022-10-16' BETWEEN START_DATE AND END_DATE
        ) THEN '대여중'
        ELSE '대여 가능'
        END AS 'AVAILABILITY'
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
ORDER BY CAR_ID DESC;

# select distinct CAR_ID, 
#     case 
#         when CAR_ID in (
#             select CAR_ID
#             from CAR_RENTAL_COMPANY_RENTAL_HISTORY
#             where '2022-10-16' between START_DATE and END_DATE
#         ) then '대여중'
#         else '대여 가능'
#         end as AVAILABILITY
# from CAR_RENTAL_COMPANY_RENTAL_HISTORY
# order by CAR_ID desc;