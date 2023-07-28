//package com.kanyideveloper.onboardingscreens.ListRequest
//
//import com.kanyideveloper.onboardingscreens.R
//
//object RequestPickUpData {
//
//    val imageNotpickup: Int
//    private val requestPickUpData = arrayOf(
//        "Sudah dipickup",
//        "Belum dipickup",
//        "Sudah dipickup",
//        "Sudah dipickup",
//        "Belum dipickup",
//        "Belum dipickup",
//        "Belum dipickup",
//        "Belum dipickup",
//        "Sudah dipickup",
//        "Belum dipickup"
//    )
//
//    private val codeDocument = arrayOf(
//        "DOC/082022/00001",
//        "DOC/082022/00002",
//        "DOC/082022/00003",
//        "DOC/082022/00004",
//        "DOC/082022/00005",
//        "DOC/082022/00006",
//        "DOC/082022/00007",
//        "DOC/082022/00008",
//        "DOC/082022/00009",
//        "DOC/082022/00010"
//    )
//
//    private val Pickup = intArrayOf(
//        R.drawable.ic_done_pickup,
//        R.drawable.ic_not_pickup,
//        R.drawable.ic_done_pickup,
//        R.drawable.ic_done_pickup,
//        R.drawable.ic_not_pickup,
//        R.drawable.ic_not_pickup,
//        R.drawable.ic_not_pickup,
//        R.drawable.ic_not_pickup,
//        R.drawable.ic_done_pickup,
//        R.drawable.ic_not_pickup,
//    )
//
//    private val tvClock = arrayOf(
//        "13:00",
//        "14:00",
//        "11:00",
//        "19:00",
//        "12:00",
//        "10:00",
//        "17:00",
//        "20:00",
//        "21:00",
//        "23:30"
//    )
//
//    private val imageClock = intArrayOf(
//        R.drawable.ic_clock,
//        R.drawable.ic_clock,
//        R.drawable.ic_clock,
//        R.drawable.ic_clock,
//        R.drawable.ic_clock,
//        R.drawable.ic_clock,
//        R.drawable.ic_clock,
//        R.drawable.ic_clock,
//        R.drawable.ic_clock,
//        R.drawable.ic_clock,
//        )
//
//    val listData : ArrayList<Request>
//    get() {
//        var list = arrayListOf<Request>()
//        for (position in requestPickUpData.indices) {
//            val request = Request()
//            request.imageNotpickup = Pickup[position]
//            request.tvNotPickup = requestPickUpData[position]
//            request.tvDocument = codeDocument[position]
//            request.tvClock = tvClock [position]
//            request.imageClock = imageClock [position]
//            list.add(request)
//
//        }
//        return list
//    }
//}
//
