object PostData {
    fun getPostBase() =
        arrayListOf<Post>(
            Post(
                1,"Мартынов",1634829296,
                "asdsdgasfrgaf", like = false, comment = false,
                share = false,5,
                5,5,"Москва",Pair(55.919554, 37.869909),
                Types.Reposts
            ),
            Post(
                2,"Захаровская",1634829296,
                "Привет", like = false, comment = false,
                share = false,1,
                1,1,"Москва",Pair(55.919554, 37.869909),
                Types.Reposts
            )

        )
}