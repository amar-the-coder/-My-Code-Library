// package BasicsOfCollectionFrameworks;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListIntro {

	public static void main(String[] args) {
		// syntax of arraylist
		// ArrayList<class type> name = new ArrayList<class type>();
		ArrayList<Integer> list = new ArrayList<>();

		// opeartions on array lists

		// 1. add
		list.add(0);
		list.add(1);
		list.add(8);
		System.out.println(list);

		// 2. get element
		int element = list.get(2);
		System.out.println(element);

		// 3. to add element in between
		list.add(3, 11);
		System.out.println(list);

		// 4. set element
		list.set(0, 100);
		System.out.println(list);

		// 5. delete
		list.remove(1);
		System.out.println(list);

		// 6. size
		int size = list.size();
		System.out.println(size);

		// 7. iterate
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// 8. sort

		Collections.sort(list);
		System.out.println(list);

	}
}
