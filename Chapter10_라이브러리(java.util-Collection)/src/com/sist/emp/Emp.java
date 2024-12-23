package com.sist.emp;
import java.util.*;

import lombok.Data;
// 클래스는 한개에 대한 정보 => 저장시에 new를 사용하면 여러개를 저장할 수 있다
@Data
public class Emp {
private int empno; // 사번
private String name; // 이름
private String job; // 직위
private int mgr; // 사수 번호
private Date hiredate; // 입사일
private int sal; // 급여
private int comn; // 성과금
private int deptno; // 부서번호

}
