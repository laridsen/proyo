package model;

import java.util.Observable;

import contract.IModel;

public final class Model extends Observable implements IModel {


	public Observable getObservable() {
		return this;
	}


}
