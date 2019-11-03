package test;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class DecodeTest {

	@Test
	public void add() throws Exception {
		Decode inst = new Decode("add $v0, $v0, $v0");
		assertEquals("rd", 2, inst.getRd());
		assertEquals("rs", 2, inst.getRs());
		assertEquals("rt", 2, inst.getRt());
	}
	
	@Test
	public void addu() throws Exception {
		Decode inst = new Decode("addu $v0, $v0, $v0");
		assertEquals("rd", 2, inst.getRd());
		assertEquals("rs", 2, inst.getRs());
		assertEquals("rt", 2, inst.getRt());
	}
	
	@Test
	public void and() throws Exception {
		Decode inst = new Decode("and $v0, $v0, $v0");
		assertEquals("rd", 2, inst.getRd());
		assertEquals("rs", 2, inst.getRs());
		assertEquals("rt", 2, inst.getRt());
	}
	
	
	@Test
	public void or() throws Exception {
		Decode inst = new Decode("or $v0, $v0, $v0");
		assertEquals("rd", 2, inst.getRd());
		assertEquals("rs", 2, inst.getRs());
		assertEquals("rt", 2, inst.getRt());
	}
	
	@Test
	public void jr() throws Exception {
		Decode inst = new Decode("jr $v0, $v0, $v0");
		assertEquals("rd", 2, inst.getRd());
	}
	
	@Test
	public void j() throws Exception {
		Decode inst = new Decode("j 50, $v0, $v0");
		assertEquals("address", 50, inst.getAddress());
	}
	
	
	@Test
	public void addi() throws Exception {
		Decode inst = new Decode("addi $v0, $v0 , 50");
		assertEquals("rd", 2, inst.getRd());
		assertEquals("rs", 2, inst.getRs());
		assertEquals("rt", 50, inst.getRt());
	}


	@Test
	public void addiu() throws Exception {
		Decode inst = new Decode("addi $v0, $v0 , 50");
		assertEquals("rd", 2, inst.getRd());
		assertEquals("rs", 2, inst.getRs());
		assertEquals("rt", 50, inst.getRt());
	}
	
	@Test
	public void andi() throws Exception {
		Decode inst = new Decode("andi $v0, $v0 , 50");
		assertEquals("rd", 2, inst.getRd());
		assertEquals("rs", 2, inst.getRs());
		assertEquals("rt", 50, inst.getRt());
	}
	
	@Test
	public void ori() throws Exception {
		Decode inst = new Decode("ori $v0, $v0 , 50");
		assertEquals("rd", 2, inst.getRd());
		assertEquals("rs", 2, inst.getRs());
		assertEquals("rt", 50, inst.getRt());
	}
	
	
	@Test
	public void lw() throws Exception {
		Decode inst = new Decode("lw $v0, $v0 , 50");
		assertEquals("rd", 2, inst.getRd());
		assertEquals("rs", 2, inst.getRs());
		assertEquals("rt", 50, inst.getRt());
	}
	

	@Test
	public void sw() throws Exception {
		Decode inst = new Decode("sw $v0, $v0 , 50");
		assertEquals("rd", 2, inst.getRd());
		assertEquals("rs", 2, inst.getRs());
		assertEquals("rt", 50, inst.getRt());
	}
	

	@Test
	public void beq() throws Exception {
		Decode inst = new Decode("beq $v0, $v0 , 50");
		assertEquals("rd", 2, inst.getRd());
		assertEquals("rs", 2, inst.getRs());
		assertEquals("rt", 50, inst.getRt());
	}
	
	@Test
	public void bne() throws Exception {
		Decode inst = new Decode("bne $v0, $v0 , 50");
		assertEquals("rd", 2, inst.getRd());
		assertEquals("rs", 2, inst.getRs());
		assertEquals("rt", 50, inst.getRt());
	}
}
