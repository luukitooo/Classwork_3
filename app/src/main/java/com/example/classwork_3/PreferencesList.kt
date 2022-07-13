package com.example.classwork_3

object PreferencesList {

    val preferencesList = listOf<Preference>(
        Preference(R.drawable.ic_person, "Edit Profile", "", false),
        Preference(R.drawable.ic_location, "Location", "", false),
        Preference(R.drawable.ic_notifications, "Notification", "", false),
        Preference(R.drawable.ic_payment, "Payment", "", false),
        Preference(R.drawable.ic_security, "Security", "", false),
        Preference(R.drawable.ic_language, "Language", "English (US)", false),
        Preference(R.drawable.ic_dark_mode, "Dark Mode", "", true),
        Preference(R.drawable.ic_lock, "Privacy Policy", "", false),
        Preference(R.drawable.ic_info, "Help Center", "", false),
        Preference(R.drawable.ic_people, "Invite Friends", "", false),
        Preference(R.drawable.ic_exit, "Logout", "", false)
    )

}