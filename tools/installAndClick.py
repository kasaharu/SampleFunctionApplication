# Imports the monkeyrunner modules used by this program
from com.android.monkeyrunner import MonkeyRunner, MonkeyDevice

# Connects to the current device, returning a MonkeyDevice object
device = MonkeyRunner.waitForConnection()

# Installs the Android package. Notice that this method returns a boolean, so you can test
# to see if the installation worked.
# device.installPackage('myproject/bin/MyApplication.apk')
# device.installPackage('/Users/kasahara/Projects/Tools/android/StartActivity.apk')
device.installPackage('/Users/kasahara/work/git/android/SampleFunctionApplication/bin/StartActivity.apk')


# sets a variable with the package's internal name
# package = 'com.example.android.myapplication'
package = 'com.kasaharu.samplefunctionapplication'

# sets a variable with the name of an Activity in the package
# activity = 'com.example.android.myapplication.MainActivity'
activity = 'com.kasaharu.samplefunctionapplication.StartActivity'

# sets the name of the component to start
runComponent = package + '/' + activity

# Runs the component
device.startActivity(component=runComponent)

# Presses the Menu button
# device.press('KEYCODE_MENU','DOWN_AND_UP')
MonkeyRunner.sleep(5)
device.touch(85, 200, "DOWN_AND_UP")

for i in range (1, 5):
    MonkeyRunner.sleep(5)
    device.touch(85, 200, "DOWN_AND_UP")


# Takes a screenshot
result = device.takeSnapshot()

# Writes the screenshot to a file
# result.writeToFile('myproject/shot1.png','png')
result.writeToFile('/Users/kasahara/Projects/Tools/android/shot1.png','png')
