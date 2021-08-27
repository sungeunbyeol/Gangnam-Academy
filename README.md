# JAVA-programming

### abstract 추상클래스
> 추상 클래스는 인스턴스(객체)를 생성할 수 없다.

### class 클래스
> 1개 이상 인터페이스를 구현할 수 있다.

### Interface 인터페이스
> 클래스 사용법과 같지만, 클래스가 아니고 인터페이스 이기 때문에 객체를 생성할 수 없고 구현할 수 없다.
> 
> 인터페이스는 기능을 정의만 할 수 있다. 
> 
> 정의한 인터페이스를 사용하고 싶으면 클래스에서 implements 하여 인터페이스가 정의한 메서드를 모두 구현해줘야 한다.
> 
> 그래서 인터페이스는 명세서 라고 표현하기도 한다.
> 
> 위에서는 인터페이스가 직접 구현할 수 없다고 했지만, default와 static을 사용하면 인터페이스도 구현된 메서드를 가질 수 있다.


### Exception 예외처리
> 변수에 무엇이 들어올지 모르는 예외 사항을 미리 예측하고 처리할 수 있다.

### Throws 예외처리
> 예외처리가 된 해당 메서드를 호출한 쪽으로 던지는 키워드이다.
> 
> 강제로 오류를 발생시키는데 사용하기도 한다.
> 
> 사용자 정의 예외처리도 있다.
> 

```
// 강제로 오류를 발생시키는 Throws 예)

public class ExceptionExam3 {

    public static void main(String[] args) {
        int i = 10;
        int j = 0;
        
        int k = divide(i, j);
        System.out.println(k);
    }
    
    public static int divide(int i, int j) {
        if(j == 0) {
            throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
        }
        int k = i / j;
        return k;
    }
}
```

## 애너테이션  
> 컴퓨터도 읽을 수 있는 주석이라고 생각하면 쉽다.
> - 표준 애너테이션
> - 메타 애너테이션
> - 마커 애너테이션


### 표준 애너테이션
> @Override
> - 컴파일러에게 오버라이딩하는 메서드라는 것을 알린다.
```
class Parent {
  void parentMethod(){}
}

class Child extends Parent{
  void parentmethod() {} //오버라이딩 하려고 했으나 실수로 이름을 잘못적음
}

이렇게 오타가 발생하게 되면 오버라이딩이 안된다. 그러면 어디서 오류가 났는지 찾기 어려움.
이때 자식 메소드 위에 @Override를 사용하면 오버라이딩 될 것이 없으면 오류 메세지를 발생한다.
```

## thymeleaf 

> 사용법:
> 
> java.class로 Controller 할 수 있는 파일을 만든 후, resources->templates->board->register.html 을 만든다.
> - 하나를 불러오고 사용할 때 사용하는 방법이다.
```
사용예시:
@RequestMapping("/board")
@Controller
public class BoardController {
	
	@GetMapping("/register")
	public String registerForm() {
		return "board/register";
		//최종 경로는 /board/register
	}
```

> java.class로 Controller 할 수 있는 파일을 만든 후, resources->templates->home0202.html 을 만든다.
> - 두개 이상을 불러오고 사용하는 방법이다.
```
사용예시:
// HomeController.class 에서
@Controller
public class HomeController {

	@GetMapping("/home0202")
		public String home0202(Model model) {
			Member member = new Member();
			
			member.setUserId("hongkd");
			member.setpassword("1234");
			member.setEmail("aaa@ccc.com");
			member.setUserName("홍길동");
			
			LocalDate dateOfBirth = LocalDate.of(1998, 10, 7);
			member.setDateOfBirth(dateOfBirth);
			
			model.addAttribute(member);
			
			return "home0202";
}

// HomeController.html 에서
  <table>
	<tr>
	<td>ID</td>
	<td th:text="${member.userId}"> id </td>
	</tr>
	<tr>
	<td>Password</td>
	<td td:text="${member.password}">pw</td>
	</tr>
	<tr>
	<td>Email</td>
	<td th:text="${member.Email}">email</td>
	</tr>
	<tr>
	<td>UserName</td>
	<td th:text="${member.UserName}">UserName</td>
	</tr>
	<tr>
	<td>Birth</td>
	<td th:text="${member.dateOfBirth}">Birth</td>
	</tr>
  </table>
```

> <!-- 타임리프 사용 선언을 했기 때문에 html 파일에서 !DOCTYPE html 필요없음-->
> 
> <html xmlns:th="http://www.thymeleaf.org">


> <!-- 타임리프 마크업에는 th속성으로 시작한다. -->
```
<!-- th:text, th:utext 속성을 사용해서 스프링 MVC에 저장된 값 또는 프로퍼티 파일에서 가져온 메세지를 표시 -->
> <h1 th:utext="${msg}">greeting</h1> // {msg}에서 <b>태그와 같은 속성을 사용할 때 utext를 사용함
> <h1 th:text="${msg}">greeting</h1> // {msg}에서 <b>태그와 같은 속성이 없을 때는 그냥 text를 사용함

	
<!-- th:action="@{}"는 주소를 의미함. 그래서 board가 있는 controller로 들어가서 modify를 찾음. -->	
<form th:action="@{/board/modify}" method="post">
   <input type="submit" value="modify(POST)">
</form>
```



