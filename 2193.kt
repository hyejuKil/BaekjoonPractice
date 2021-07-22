fun main(){
    var t : Int = readLine()!!.toInt()
    var mem = Array<Long>(t+1,{0})

    mem[0] =0
    mem[1] =1

    for(i in 2..t){
        mem[i] = mem[i-2]+mem[i-1]
    }

    print(mem[t])
}