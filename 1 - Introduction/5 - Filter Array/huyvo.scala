def f(delim:Int,arr:List[Int]):List[Int] = for (i <- arr if i < delim) yield i
