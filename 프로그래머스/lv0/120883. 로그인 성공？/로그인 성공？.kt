class Solution {
    fun solution(id_pw: Array<String>, db: Array<Array<String>>): String {

        val id = id_pw[0]
        val pw = id_pw[1]

        for (i in db.indices) {

            if (id == db[i][0] && pw == db[i][1]) {
                return "login"
            } else if (id == db[i][0] && pw != db[i][1]) {
                return "wrong pw"
            }
        }
        return "fail"
    }

}