package com.javaex.ex22;

public class ShapeApp {

	public static void main(String[] args) {

		/*
		Shape s01 = new Shape("빨강", "검정");
		System.out.println(s01.toString());
		
		
		Triangle t01 = new Triangle("주황", "검정", 13, 15);
		//System.out.println(t01.toString());
		t01.draw();
		
		Rectangle r01 = new Rectangle("파랑", "빨강", 20, 35);
		//System.out.println(r01.toString());
		r01.draw();
		
		Circle c01 = new Circle("빨강", "검정", 5);
		//System.out.println(c01.toString());
		c01.draw();
		*/
		
		
		
		//모든 도형을 하나의 배열로 관리하고 싶을 때
		Shape st = new Triangle("초록", "초록", 100, 100);
		// st.draw(); getwidth(); getheight(); -->불가능
		
		Shape sc = new Circle("빨강", "빨강", 50);
		//sc.getradius(); --> 불가능
		
		Shape sr = new Rectangle("노랑", "파랑", 25, 30);
		//sr.getwidth(); getheight();
		
		
		
		//하나의 배열에 모든 도형을 담는다 --> 자식 쪽 기능은 사용할 수 없음
		//모든 도형을 담을 수 있는 배
		Shape[] sArray = new Shape[3];
		
		//도형담기
		//sArray[0] = t01; Shape <-- Triangle //자동으로 섞어쓰기가 됨 ==> 업캐스팅
		
		
		
		sArray[0] = st;
		sArray[1] = sc;
		sArray[2] = sr;

		//전체 도형을 draw()로 출력 --> 자식쪽의 기능으로 사용할 수 없음
		for(int i=0; i<sArray.length; i++) {
			sArray[i].draw();
		}
		
		//삼각형의 밑변
		System.out.println(((Triangle)sArray[0]).getWidth());
		//사각형의 가로
		System.out.println(((Rectangle)sArray[2]).getWidth());
		//원의 반지름
		System.out.println(((Circle)sArray[1]).getRadius());
		
		/* 부모만 올리는 경우를 아예 막아버리기(abstract)
		Shape s = new Shape("빨강", "빨강");
		s.draw();
		*/
		
		
	}

}
