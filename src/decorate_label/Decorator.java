package decorate_label;

public class Decorator extends Component {
	private Component decoratedComponent;

	public Decorator(Component component) {
		this.decoratedComponent = component;
	}


	@Override
	public void decorate() {
		decoratedComponent.decorate();
	}
	
	

}
