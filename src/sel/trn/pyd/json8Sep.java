package sel.trn.pyd;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class json8Sep {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Map obj=new HashMap();
		obj.put(1,"a");
		obj.put(2,"b");
		obj.put(3,"c");
		
		String jsonstring=JSONValue.toJSONString(obj);
		System.out.println(jsonstring);
		
		JSONParser parser=new JSONParser();
		String s="[0,{\"1\":{\"2\":{\"3\":{\"4\":[5,{\"6\":7}]}}}}]";
		Object obj1=parser.parse(s);//create an object of string s
		JSONArray array=(JSONArray)obj1;//json array of the above object
		System.out.println("2nd element of the array");
		System.out.println(array.get(1));//we get the 2nd index of the array with this
		//output--2nd element of the array
		//{"1":{"2":{"3":{"4":[5,{"6":7}]}}}}
		
		
		JSONObject obj2=(JSONObject)array.get(1);//we create a json object with the second array
		System.out.println("Field \"1\"");
		
		//here we have used the key 1 to get the corresponding value 
        System.out.println(obj2.get("1"));
        //hence the output will be  -- {"2":{"3":{"4":[5,{"6":7}]}}}

		s= "{}";
		obj1= parser.parse(s);
		System.out.println(obj1);
		//output -- {}
		
		s="[5,]";
		obj1=parser.parse(s);
		System.out.println(obj1);
		
		s="[5,,2]";
		obj1=parser.parse(s);
		System.out.println(obj1);
		
		
		}
}
