package mypkg;

import java.io.Serializable;

import javax.ejb.Remote;
import javax.ejb.Stateless;

@Stateless
@Remote(AIntf.class)
public class A implements AIntf, Serializable {

	private static final long serialVersionUID = -1L;

	public String doSomething() {
		return "hello world";
	}

}
