package active

import com.act.code.tools.*

// 生成 String
fun main() {

    repeat(20) {
        println(genKey((6..9).random()))
    }

}
