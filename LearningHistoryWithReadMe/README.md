# LearningHistoryWithReadMe
history of my daily learning something
1. Javascript
2. React
3. BootStrap


1. Javascript

this 키워드(https://www.youtube.com/watch?v=PAr92molMHU)
javascript의 this 예약어는 '누가' 실행했느냐에 따라서 정해짐.
-->this는 호출했을 때 실행한 객체에 엮이게 된다.
-->호출과 무관하게 고정적으로 사용하고 싶을 경우,bind 함수를 사용


2. React

React를 써야하는 이유 : https://environmentset.github.io/2019/02/13/Why-use-React/

React의 특징 : Virtual DOM 구조를 사용한 컴파일로 브라우저의 부담을 줄임
--> 성능 향상
실행 단위를 컴포넌트(Component)

React는 모듈을 불러오기 위해 import를, 다른 모듈에서 import를 할 수 있게 하려면 export를 사용함
(참조 : http://wiki.sys4u.co.kr/pages/viewpage.action?pageId=8553594)
default export는 모듈당 1개만 존재 

React는 App 컴포넌트에서 부터 시작.(main 함수와 같은 개념으로 사용하기)
다른 function을 이용하기 위해서 사용하는 것이 jsx + props
jsx : react에서 사용하는 javascript 문법
props : react에서 다른 컴포넌트에 인자를 전달하는 방법

ex)
//변수 정의 부분
const foodILike = []

//----------------------------------------------
//함수로 하나의 모듈 구현
//중괄호를 사용한 매개변수 받기
//----------------------------------------------
function renderFood(dish){
  return <Food key = {dish.id} name = {dish.name} image = {dish.image}/>
}
//Unique key를 지정해주지 않으면 에러를 출력한다.
//각 div를 고유한 id로 제어하기 위함
//Warning: Each child in a list should have a unique "key" prop.

//javascript map + props를 통하여 인자 전달/
function App() {
  return (
    <div className="App">
      {console.log(foodILike.map(renderFood))}
      {foodILike.map(renderFood)}
    </div>
  );
}

3.BootStrap

클래스를 통한 레이아웃 구성. 클래스 2개를 지정하여 사용
btn : 버튼

다운로드 방법 : CDN(Contents Download Network)를 통한 링크접속으로 사용하거나, 부트스트랩 홈페이지를 통하여 다운.

모달 : 임시 창
캐러셀 : 화살표로 움직이는 창
