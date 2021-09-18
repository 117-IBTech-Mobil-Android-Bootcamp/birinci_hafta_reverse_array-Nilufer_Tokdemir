package com.example.week3homework


fun Array<Int>.reverseArrayFromIndex(index : Int = 0){
    var lastIndex = this.lastIndex

    if(this.size <= index || index < 0 || index == lastIndex || index == lastIndex -1)
    {
        return
    }

    for(i in ((index+1)..lastIndex))
    {
        val tempswap = this.get(i)
        this[i] = this.get(lastIndex)
        this[lastIndex] = tempswap
        lastIndex -= 1
        if (lastIndex <= i)
            break
    }
}