# 서울에서 배빵빵
 서울 디저트 맛집 소개 페이지 제작 프로젝트


<br><br>

## 프로젝트 개요

#### 프로젝트 목적
- 점차 증가하는 디저트 수요에 맞춰 서울 디저트 맛집을 검색하고 리뷰 및 평점을 작성해 서로 맛집을 공유하는 목적의 웹 서비스 제작하였습니다.

#### 프로젝트 기간
- `2023-04-03` ~ `2023-04-21`

#### 프로젝트 배포
- cafe24 호스팅

<br><br>

## 멤버 구성
<table>
  <tbody>
    <tr>
      <td align="center"><a href="https://github.com/hsnkch"><img src="https://avatars.githubusercontent.com/u/111720919?v=4" width="100px;" alt=""/><br /><sub><b>hsnkch</b></sub></a><br /></td>
      <td align="center"><a href="https://github.com/hyeokjulee"><img src="https://avatars.githubusercontent.com/u/122426157?v=4" width="100px;" alt=""/><br /><sub><b>hyeokjulee</b></sub></a><br /></td>
      <td align="center"><a href="https://github.com/BestGuby"><img src="https://avatars.githubusercontent.com/u/122503489?v=4" width="100px;" alt=""/><br /><sub><b>BestGuby</b></sub></a><br /></td>
      <td align="center"><a href="https://github.com/JungSoy"><img src="https://avatars.githubusercontent.com/u/121956754?v=4" width="100px;" alt=""/><br /><sub><b>JungSoy</b></sub></a><br /></td>
      <td align="center"><a href="https://github.com/KyungoeSim"><img src="https://avatars.githubusercontent.com/u/122503488?v=4" width="100px;" alt=""/><br /><sub><b>KyungoeSim</b></sub></a><br /></td>
    </tr>
  </tbody>
</table>

- `최현식` : 팀장, DB 설계, 지도 API
- `이혁주` : 로그인 기능 및 회원 관리 (CRUD)
- `박성준` : 가게 리스트 (CRUD), 리뷰 기능 구현
- `정소영` : 자유게시판 (CRUD), 사이트 소개 게시판 (CRUD)
- `심경외` : 메인페이지 디자인, 지도 API

<br><br>

## 기술 스택
#### 🖥️ FE
<a href="https://www.w3.org/TR/html52/" target="_blank">
  <img src="https://img.shields.io/badge/-HTML5-E34F26?style=for-the-badge&logo=html5&logoColor=white" alt="HTML5">
</a>
<a href="https://www.w3.org/Style/CSS/" target="_blank">
  <img src="https://img.shields.io/badge/-CSS3-1572B6?style=for-the-badge&logo=css3&logoColor=white" alt="CSS3">
</a>
<a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript" target="_blank">
  <img src="https://img.shields.io/badge/-JavaScript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black" alt="JavaScript">
</a>
<a href="https://jquery.com" target="_blank">
  <img src="https://img.shields.io/badge/-jQuery-0769AD?style=for-the-badge&logo=jquery&logoColor=white" alt="jQuery">
</a>
<a href="https://getbootstrap.com" target="_blank">
  <img src="https://img.shields.io/badge/-Bootstrap-7952B3?style=for-the-badge&logo=bootstrap&logoColor=white" alt="Bootstrap">
</a>

#### ⌨️ BE
<a href="https://openjdk.java.net" target="_blank">
  <img src="https://img.shields.io/badge/-Java%2011-CC0000?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java">
</a>
<a href="https://spring.io/projects/spring-framework" target="_blank">
  <img src="https://img.shields.io/badge/-Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white" alt="Spring">
</a>
<a href="https://tomcat.apache.org" target="_blank">
  <img src="https://img.shields.io/badge/-Apache%20Tomcat-F8DC75?style=for-the-badge&logo=apache%20tomcat&logoColor=black" alt="Apache Tomcat">
</a>
<br>
<a href="https://mybatis.org/mybatis-3/" target="_blank">
  <img src="https://img.shields.io/badge/-MyBatis-E34F26?style=for-the-badge&logo=MyBatis&logoColor=white" alt="MyBatis">
</a>
<a href="https://www.mysql.com" target="_blank">
  <img src="https://img.shields.io/badge/-MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white" alt="MySQL">
</a>

#### 🔨 dev tool
<a href="https://www.eclipse.org/" target="_blank">
  <img src="https://img.shields.io/badge/-Eclipse%20IDE-2C2255?style=for-the-badge&logo=eclipseide&logoColor=white">
</a>
<a href="https://code.visualstudio.com/" target="_blank">
  <img src="https://img.shields.io/badge/-Visual%20Studio%20Code-007ACC?style=for-the-badge&logo=visual-studio-code&logoColor=white" alt="Visual Studio Code">
</a>
<a href="https://www.postman.com/" target="_blank">
  <img src="https://img.shields.io/badge/-Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white" alt="Postman">
</a>

#### ⛓️ API
- 카카오맵 API (https://apis.map.kakao.com/)
- 공공 데이터 포털 (https://www.data.go.kr/)
<br><br>

## 주요 기능

### 💡 보안
- 스프링 시큐리티의 CSRF 토큰을 이용해 실제 위조된 페이지에서 받는 요청을 걸러내 실제 페이지에서 전송된 요청만을 처리할 수 있게 하였습니다.

### 💡 회원
- Spring Security를 이용한 인증 및 사용자 역할에 따른 인가 방식을 기본 세션 & 쿠키 방식을 이용해 구현했습니다.
- 사용자의 역할은 관리자와 회원으로 구분했습니다.

### 💡 자유게시판
- 같이 맛집을 갈 사람을 모집하는 등 다양한 목적에 따라 회원이 글을 작성할 수 있는 게시판입니다.

### 💡 사이트 소개
- 관리자가 사이트에 대한 소개 글이나 공지사항을 작성할 수 있는 게시판입니다.

### 💡 맛집 리스트
- 공공데이터 포털을 이용해 서울에서 영업 신고된 제과점들을 데이터베이스에 등록해 이를 나타냅니다.
- MyBatis의 동적 쿼리문을 이용해 검색 기능을 구현했습니다.

### 💡 맛집 상세보기
- 가게의 메뉴, 정보와 회원들이 남긴 리뷰 및 평점을 조회할 수 있습니다.
  
### 💡 리뷰 및 평점
- 회원이 각 가게마다 간단한 코맨트를 남기거나 5점 만점으로 평점을 매길 수 있습니다.

### 💡 메인 페이지
- 맛집 검색 / 현 위치 중심 지도 / 자유게시판 / 사이트 소개 로 구성되어 있습니다.
<br><br>

## 프로젝트 결과 소개
- ### 메인페이지
<p align="center">
  <img src="https://github.com/hsnkch/bbang/assets/111720919/43410462-8734-41e0-8dd9-48426667e95f">
  <img src="https://github.com/hsnkch/bbang/assets/111720919/78a0ddef-72c7-4255-9c98-02d18f954f39">  
</p>

- ### 맛집 리스트
<p align="center">
  <img src="https://github.com/hsnkch/bbang/assets/111720919/ef415dae-886b-4fff-ae15-74e676e838ae">
</p>

- ### 맛집 상세보기 및 리뷰
<p align="center">
  <img src="https://github.com/hsnkch/bbang/assets/111720919/130d4784-b1f9-4cf0-8572-a4050ed67ba8">
</p>

- ### 공지사항

<p align="center">
  <img src="https://github.com/hsnkch/bbang/assets/111720919/15a59ecf-5e41-4760-a46d-db47142d36be">
</p>

- ### 자유게시판
 
<p align="center">
  <img src="https://github.com/hsnkch/bbang/assets/111720919/d03ba17c-ecfa-4486-9308-b98c964b3e37">
</p> 

