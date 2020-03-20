package application;


// DANIELA VILLAMAR 19086
// MIRKA MONZON 18139
// SEBASTIAN MALDONADO 18003
// PROYECTO FASE 2
// FECHA DE ENTREGA: 20/03/2020


import java.util.Vector;

public class OperationStack implements Stack<String>{
	
	/**
	 * almacena los operandos y operaciones
	 */
	private Vector<String> vector;
	
	/**
	 * Constructor
	 */
	public OperationStack() {
		// TODO Auto-generated constructor stub
		vector = new Vector<String>();
	}

	@Override
	public void push(String item) {
		// TODO Auto-generated method stub
		vector.add(item);
	}

	@Override
	public String pop() {
		// TODO Auto-generated method stub
		if(!vector.isEmpty()) {
			String lastElement = vector.lastElement();
			vector.remove(vector.size()-1);
			return lastElement;
		}else {			
			return null;
		}
	}

	@Override
	public String peek() {
		// TODO Auto-generated method stub
		if(!vector.isEmpty()) {
			String lastElement = vector.lastElement();
			return lastElement;
		}else {			
			return null;
		}
	}

	@Override
	public boolean empty() {
		// TODO Auto-generated method stub
		if(!vector.isEmpty()) {
			return true;
		}else {			
			return false;
		}
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return vector.size();
	}

}