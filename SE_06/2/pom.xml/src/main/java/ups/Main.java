/*������� 2. ������������� Map
 *������� �������������� �����, ����������� �������� �������� �� ������ properties-�����.
 *���������� ������ ����� ������ ����������� ������ ���� ���. ���������� ������ ������� � 
 *��������� ���� Map. �������� �� ������: ��� ����� ���� map-��������� ���� � ��� �������� 
 *������� � ������, ������� ��� ������������? 
 */

package ups;

import java.util.Map;

public class Main {
	public static void main(String[] args) {
		// String path = "d:\\1";
		String path = "./src/main/resources/test.properties";
		UniversalPropertiesReader upr = new UniversalPropertiesReader(path);
		Map<String, String> prMap = upr.getMap();
		System.out.println(prMap);

		prMap.put("k1", "v11");
		System.out.println(prMap);
	}
}
