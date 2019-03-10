package starter.gradle;

import org.jooby.hbs.Hbs;
import org.jooby.*;
import org.jooby.assets.Assets;
import org.jooby.json.Gzon;

public class App extends Jooby {

	{
	    port( 8000 );
	    securePort( 8443 );
	}
  {
    use(new Hbs());
  	use(new Gzon());
  	use(new Assets());

  	get("/",() -> Results.when("text/html", () -> Results.html("sparrow")));
	}
  	
  	public static void main(String[] args) {
    	run(App::new, args);
  	}
}
