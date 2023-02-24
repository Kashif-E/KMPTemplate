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
<ul>
<li>Runs natively on Android. </li>
<li>Uses UIKit under the hood for IOS. </li>
<li> Uses Skia Library under the hood for desktop. </li>
</ul>

# Template Features
<ul>
<li>Compose Multiplatform already setup </li>
<li>Koin already setup </li>
<li>Ktor already setup </li>
</ul>


# Is it production ready?
Well yes and no at the same time. You can use compose generated UIControllers with swift ui to share ui and use swift ui or uikit for features like camera, sensors etc.

If you have any suggestion or found a bug please add it to the issues.

# Troubleshooting

## MacOS on Apple Chit (M1/M2)
If you encounter the error `'pod install' command failed with code 1.` run the following commands 
in the terminal
```
sudo softwareupdate --install-rosetta --agree-to-license
```
```
sudo gem uninstall ffi && sudo gem install ffi -- --enable-libffi-alloc
```



<p align="left">
<a href="https://twitter.com/kashif_mehmood_" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/twitter.svg" alt="kashif_mehmood_" height="30" width="40" /></a>
<a href="https://linkedin.com/in/kashif-mehmood" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/linked-in-alt.svg" alt="kashif-mehmood" height="30" width="40" /></a>
<a href="https://stackoverflow.com/users/kashif-mehmood" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/stack-overflow.svg" alt="kashif-mehmood" height="30" width="40" /></a>
<a href="https://fb.com/kashi.m.456" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/facebook.svg" alt="kashi.m.456" height="30" width="40" /></a>
<a href="https://instagram.com/kashif_mehmood._" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/instagram.svg" alt="kashif_mehmood._" height="30" width="40" /></a>
<a href="https://medium.com/@kashif-mehmood-km" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/medium.svg" alt="@kashif-mehmood-km" height="30" width="40" /></a>
</p>

