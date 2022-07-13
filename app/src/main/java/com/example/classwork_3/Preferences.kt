package com.example.classwork_3

enum class Preferences(val icon: Int, val text: String, val hint: String, val isSwitch: Boolean) {

    EDIT_PROFILE(R.drawable.ic_person, "Edit Profile", "", false),
    LOCATION(R.drawable.ic_location, "Location", "", false),
    NOTIFICATION(R.drawable.ic_notifications, "Notification", "", false),
    PAYMENT(R.drawable.ic_payment, "Payment", "", false),
    SECURITY(R.drawable.ic_security, "Security", "", false),
    LANGUAGE(R.drawable.ic_language, "Language", "English (US)", false),
    DARK_MODE(R.drawable.ic_dark_mode, "Dark Mode", "", true),
    PRIVACY_POLICY(R.drawable.ic_lock, "Privacy Policy", "", false),
    HELP_CENTER(R.drawable.ic_info, "Help Center", "", false),
    INVITE_FRIENDS(R.drawable.ic_people, "Invite Friends", "", false),
    LOGOUT(R.drawable.ic_exit, "Logout", "", false)

}