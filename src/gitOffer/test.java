ist<List<Integer>> res = new ArrayList<>();
	public List<List<Integer>> permute(int[] nums) {
		res.clear();
		dfs(nums, 0);//
		return res;
	}
	
	public void dfs(int[] n, int start) {//start表示要被替换元素的位置
		if( start >= n.length) {
			List<Integer> list = new ArrayList<Integer>();
			for(int i : n) {
				list.add(i);
			}
			res.add(list);
			return;
		}
		
		for(int i = start; i< n.length; i++) {//i从start开始，如果从start+1开始的话，会把当前序列遗漏掉直接保存了下一个序列
			int temp= n[i];
			n[i] = n[start];
			n[start] = temp;
			dfs(n, start + 1);//递归下一个位置
			//回到上一个状态
			n[start] = n[i];
			n[i] = temp;
		}
	}
————————————————
版权声明：本文为CSDN博主「qijingpei」的原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/qijingpei/article/details/83930870
