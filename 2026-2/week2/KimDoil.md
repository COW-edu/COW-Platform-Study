1. To-Do list ERD 

- 용어 정리
- Entity: 사람, 물체, 개념(계정)
- Relationship: Entity-Entity 연결해주는 관계
- Attribute: 속성 (사람 => 키, 몸무게, 성별 ....)
- PK: 테이블에서 각 행을 유일하게 구분하기 위한 식별자 (테이블 당 단 1개)
- UK: 해당 컬럼의 데이터가 중복되지 않고 유일하도록 보장하는 키 (테이블에 여러 개 존재 가능)
- FK: 한 테이블의 컬럼이 다른 테이블의 PK(or UK)를 참조하여 두 테이블 간의 관계를 맺어주는 키
- GET: 서버로부터 리소스(데이터)를 조회할 때 사용합니다.
- POST: 서버에 새로운 리소스를 생성(등록)할 때 사용합니다.
- PATCH/PUT: 기존 리소스의 일부 항목만 수정할 때 사용합니다.
- DELETE: 서버의 특정 리소스를 삭제할 때 사용합니다.

1.1 테이블 구조

1.1.1 User 테이블
| 구분 | 컬럼명 (Column Name) |
| PK | User_ID |
| UK | Email |
| Key | Password |
| UK | Nickname |

1.1.2 To-Do 테이블
| 구분 | 컬럼명 (Column Name) |
| PK | To-Do_ID |
| Key | Title |
| Key | Content |
| Key | Category |
| FK | User_ID |
| Key | is_Completed |

> 관계: `User` (1) : `To-Do` (N)  
> 한 명의 유저는 여러 개의 To-Do 항목을 가질 수 있습니다.

제공해주신 'COW To-Do API 명세서' 엑셀 파일의 전체 내용입니다.

COW To-Do API 명세서

| 이름 | 주기능 | 상세기능 | Method |	API Path |
1. 회원 가입	 1.1 회원가입	-	POST	/api/users
             1.2 로그인	-	POST	/api/users/login
2. 회원 가입 방법	2.1 이메일 등록	-	POST	-
                  2.2 카카오 간편 등록	-	POST	-
3. 회원 탈퇴 3.1 회원 탈퇴	-	DELETE	/api/users/delete
4. 할일 등록	4.1 할일 등록	4.1.1 할일 제목 등록	POST	/api/todo/title
                          4.1.2 할일 내용 등록	POST	/api/todo/content
                          4.1.3 할일 카테고리 등록	POST	/api/todo/category
                          4.1.4 할일 완료여부 설정	POST	/api/todo/is_completed
5. 할일 수정	5.1 할일 수정	5.1.1 할일 제목 수정	PATCH	/api/todo/title/patch
                          5.1.2 할일 내용 수정	PATCH	/api/todo/content/patch
                          5.1.3 할일 카테고리 수정	PATCH	/api/todo/category/patch
                          5.1.4 할일 완료여부 수정	PATCH	/api/todo/is_completed/patch
6. 할일 검색	6.1 할일 검색	-	-	/api/todo/search
            6.2 카테고리	6.2.1 카테고리 검색	GET	/api/todo/search/category
                        6.2.2 카테고리 지정	POST	/api/todo/search/category/pick
                        6.2.3 나만의 카테고리	POST	/api/todo/search/category/create_MyCategory
            6.3 할일 목록 조회	6.3.1 전체 조회	GET	/api/todo/lists/all
                              6.3.2 To-Do_ID 조회	GET	/api/todo/lists/To-Do_ID
                              6.3.3 카테고리 조회	GET	/api/todo/lists/category
                              6.3.4 완료여부 조회	GET	/api/todo/lists/is_completed
7. 할일 삭제	7.1 할일 삭제	-	DELETE	/api/todo/delete
