package MinBinHeap_A3;

public class MinBinHeap_Playground {
	public static void main(String[] args){   
		//Add more tests as methods and call them here!!
		TestBuild2();
	}

	public static void TestBuild3(){
		Heap_Interface heap = new MinBinHeap();
		EntryPair[] array0 = { 
				new EntryPair("abc", 6), 
				new EntryPair("bcd", 12), 
				new EntryPair("cde", 9),
				new EntryPair("def", 4), 
				new EntryPair("efg", 5), 
				new EntryPair("fgh", 3), 
		};
		System.out.println(array0.length);

		printHeapCollection(array0);
		heap.build(array0);
		printHeap(heap.getHeap(), heap.size());
	}

	public static void TestBuild2(){
		MinBinHeap mbh= new MinBinHeap();
		EntryPair[] collection= new EntryPair[15];
		collection[0]=new EntryPair("o",15);
		collection[1]=new EntryPair("n",14);
		collection[2]=new EntryPair("m",13);
		collection[3]=new EntryPair("l",12);
		collection[4]=new EntryPair("k",11);
		collection[5]=new EntryPair("j",10);
		collection[6]=new EntryPair("i",9);
		collection[7]=new EntryPair("h",8);
		collection[8]=new EntryPair("g",7);
		collection[9]=new EntryPair("f",6);
		collection[10]=new EntryPair("e",5);
		collection[11]=new EntryPair("d",4);
		collection[12]=new EntryPair("c",3);
		collection[13]=new EntryPair("b",2);
		collection[14]=new EntryPair("a",1);

		printHeapCollection(collection);
		mbh.build(collection);
		printHeap(mbh.getHeap(), mbh.size());

	}

	public static void TestBuild(){ 
		// constructs a new minbinheap, constructs an array of EntryPair, 
		// passes it into build function. Then print collection and heap.
		MinBinHeap mbh= new MinBinHeap();
		EntryPair[] collection= new EntryPair[8];
		collection[0]=new EntryPair("i",3);
		collection[1]=new EntryPair("b",5);
		collection[2]=new EntryPair("c",1);
		collection[3]=new EntryPair("d",0);
		collection[4]=new EntryPair("e",46);
		collection[5]=new EntryPair("f",5);
		collection[6]=new EntryPair("g",6);
		collection[7]=new EntryPair("h",17);
		mbh.build(collection);
		printHeapCollection(collection);
		printHeap(mbh.getHeap(), mbh.size());
		System.out.println("\n");

		mbh.delMin();
		printHeap(mbh.getHeap(), mbh.size());
		System.out.println("\n");

		mbh.delMin();
		printHeap(mbh.getHeap(), mbh.size());
		System.out.println("\n");

		mbh.delMin();
		printHeap(mbh.getHeap(), mbh.size());

		mbh.insert(new EntryPair("z", 0));
		mbh.insert(new EntryPair("y", 2));
		mbh.insert(new EntryPair("r", 4));

		//printHeap(mbh.getHeap(), mbh.size());
		mbh.delMin();
		printHeap(mbh.getHeap(), mbh.size());
		mbh.delMin();
		printHeap(mbh.getHeap(), mbh.size());

	}

	public static void printHeapCollection(EntryPair[] e) { 
		//this will print the entirety of an array of entry pairs you will pass 
		//to your build function.
		System.out.println("Printing Collection to pass in to build function:");
		for(int i=0;i < e.length;i++){
			System.out.print("("+e[i].value+","+e[i].priority+")\t");
		}
		System.out.print("\n");
	}

	public static void printHeap(EntryPair[] e,int len) { 
		//pass in mbh.getHeap(),mbh.size()... this method skips over unused 0th index....
		System.out.println("Printing Heap");
		for(int i=1;i < len+1;i++){
			System.out.print("("+e[i].value+","+e[i].priority+")\t");
		}
		System.out.print("\n");
	}
}
