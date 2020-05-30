import java.util.Comparator;
import java.util.LinkedList;

	public class Sort implements Comparator<Student> {
		
		@Override
		public int compare(Student a, Student b) {
			
			return a.getName().compareTo(b.getName());
		}
		
		public void NameSelectorSort (LinkedList<Student> arr) {
		
			int MinIndex;
			Student MinValue;
			Student temp;
			int i;
			int j;
			
		for (i = 0; i < arr.size() - 1; i++ ) {
			
			MinIndex = i;
			MinValue = arr.get(i);
			
			for (j = i + 1; j < arr.size(); j++) {
				
				int result = compare(arr.get(j), arr.get(MinIndex));
				
				if (result < 0) {
					
					MinIndex = j;
					MinValue = arr.get(MinIndex);
				}
				
			}
			
			temp = arr.get(MinIndex);
			arr.set(MinIndex, arr.get(i));
			arr.set(i, temp);
			
		}
	 }
   }

