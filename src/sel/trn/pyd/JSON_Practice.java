package sel.trn.pyd;

import java.io.IOException;
import java.io.StringWriter;

import org.json.simple.JSONObject;

@SuppressWarnings("unused")
public class JSON_Practice {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		  JSONObject obj = new JSONObject();
		  obj.put("name", "foo");
	      obj.put("num", new Integer(100));
	      obj.put("balance", new Double(1000.21));
	      obj.put("is_vip", new Boolean(true));

	      System.out.print(obj);
	      
	      StringWriter out = new StringWriter();
	      obj.writeJSONString(out);
	      
	      String jsonText = out.toString();
	      System.out.print(jsonText);
	}

}
