# KMPTemplate

<a href="https://www.buymeacoffee.com/kashifmehmood"><img src="https://img.buymeacoffee.com/button-api/?text=Buy me a coffee&emoji=&slug=kashifmehmood&button_colour=FFDD00&font_colour=000000&font_family=Cookie&outline_colour=000000&coffee_colour=ffffff" /></a>

This template can be used to develop for three targets
1. Android
2. Ios
3. Desktop

This is built to reduce the effort of configuring all the targets together such as Compose for Ios which currently does not have an ios target when creating a new compose multiplatform project using intellij idea.

This is a bear minimum without networking or other things such as db. This will only provide you a basic hello world app setup.

![Screenshot 2023-02-14 at 8 06 39 PM](https://user-images.githubusercontent.com/61690178/218813583-2c7a2ef9-4b42-4095-b5a6-7a6d5417bbf9.png)

# How it works?
Runs natively on Android.
Uses UIKit under the hood for IOS.
Uses Skia Library under the hood for dekstop.

# Is it production ready?
Well yes and no at the same time. You can use compose generated UIControllers with swift ui to share ui and use swift ui or uikit for features like camera, sensors etc.

If you have any suggestion or found a bug please add it to the issues.

