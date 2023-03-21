package com.example.beak.Appp.어뎁터패턴;



//App 에서 아우터타이거도 블락하려는데, man은 animal을 블락하고 있고 고양이랑 개는 애니멀에 상속(extends)돼있어서 됨.
// 그러니 아우터 타이거도 애니멀에 상속시키면 맨이 아우터 타이거도 animal 로 인식하고 블락 시킬 수 있는데
//아우터 타이거를 애니멀에 상속 시키면 ocp(개방 폐쇄의 원칙(OCP)이란 기존의 코드를 변경하지 않으면서, 기능을 추가할 수 있도록 설계가 되어야 한다는 원칙)
// 원칙을 위반하게 됨. 그럼 프록시(중개자,대리자)처럼 뭐 하나 만들어야 하는데 이때 쓸게 포록시 대신 어뎁터 이다.


public class Tiger{
    private String fullName="어뎁터호랑이";
//예전에 만들어진 레거시 코드 OR 외부에서 들고 온 라이브러리라고 쳐보자. 그래서 여태 만들어온 Name이 아니라 FullName으로 쓰임 이걸 name으로 바꾸는 방법 말고
//    FullName 으로 쭉 쓸거다.그러기 위해 어뎁터를 끼워 써보자.

    public String getFullName(){
        return fullName;
    }
}
