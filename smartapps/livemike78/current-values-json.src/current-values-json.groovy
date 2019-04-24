/**
 * SmartHome Data Drop
 * Make available the current states of devices to be consumed as JSON
 * Used to store history of data for analysis
 *
 * 2018-06-20;
 *
 */
 
definition(
    name: "Current Values JSON",
    namespace: "LiveMike78",
    author: "Mike Horrocks",
    description: "List sensor states",
    category: "",
    iconUrl: "https://secure.gravatar.com/avatar/9d6b5d0f7a7a758857e34d3b6443c658",
    iconX2Url: "https://secure.gravatar.com/avatar/9d6b5d0f7a7a758857e34d3b6443c658",
    iconX3Url: "https://secure.gravatar.com/avatar/9d6b5d0f7a7a758857e34d3b6443c658",
    oauth: [displayName: "Current Values JSON", displayLink: "http://localhost:4567"])

preferences {

	section("Capabilities To Monitor:") {
		input "accelerationSensors", "capability.accelerationSensor", title: "Acceleration Sensors", multiple: true, required: false
		input "airConditionerModes", "capability.airConditionerMode", title: "Air Conditioner Modes", multiple: true, required: false
		input "airQualitySensors", "capability.airQualitySensor", title: "Air Quality Sensors", multiple: true, required: false
		input "alarms", "capability.alarm", title: "Alarms", multiple: true, required: false
		input "audioMutes", "capability.audioMute", title: "Audio Mutes", multiple: true, required: false
		input "audioTrackDatas", "capability.audioTrackData", title: "Audio Track Datas", multiple: true, required: false
		input "audioVolumes", "capability.audioVolume", title: "Audio Volumes", multiple: true, required: false
		input "batteries", "capability.battery", title: "Batteries", multiple: true, required: false
		input "beacons", "capability.beacon", title: "Beacons", multiple: true, required: false
		input "carbonDioxideMeasurements", "capability.carbonDioxideMeasurement", title: "Carbon Dioxide Measurements", multiple: true, required: false
		input "carbonMonoxideDetectors", "capability.carbonMonoxideDetector", title: "Carbon Monoxide Detectors", multiple: true, required: false
		input "colorControls", "capability.colorControl", title: "Color Controls", multiple: true, required: false
		input "colorTemperatures", "capability.colorTemperature", title: "Color Temperatures", multiple: true, required: false
		input "colors", "capability.color", title: "Colors", multiple: true, required: false
		input "colorModes", "capability.colorMode", title: "Color Modes", multiple: true, required: false
		input "consumables", "capability.consumable", title: "Consumables", multiple: true, required: false
		input "contactSensors", "capability.contactSensor", title: "Contact Sensors", multiple: true, required: false
		input "demandResponseLoadControls", "capability.demandResponseLoadControl", title: "Demand Response Load Controls", multiple: true, required: false
		input "dishwasherModes", "capability.dishwasherMode", title: "Dishwasher Modes", multiple: true, required: false
		input "dishwasherOperatingStates", "capability.dishwasherOperatingState", title: "Dishwasher Operating States", multiple: true, required: false
		input "doorControls", "capability.doorControl", title: "Door Controls", multiple: true, required: false
		input "dryerModes", "capability.dryerMode", title: "Dryer Modes", multiple: true, required: false
		input "dryerOperatingStates", "capability.dryerOperatingState", title: "Dryer Operating States", multiple: true, required: false
		input "dustSensors", "capability.dustSensor", title: "Dust Sensors", multiple: true, required: false
		input "energyMeters", "capability.energyMeter", title: "Energy Meters", multiple: true, required: false
		input "estimatedTimeOfArrivals", "capability.estimatedTimeOfArrival", title: "Estimated Time Of Arrivals", multiple: true, required: false
		input "executes", "capability.execute", title: "Executes", multiple: true, required: false
		input "fanSpeeds", "capability.fanSpeed", title: "Fan Speeds", multiple: true, required: false
		input "filterStatus", "capability.filterStatus", title: "Filter Status", multiple: true, required: false
		input "garageDoorControls", "capability.garageDoorControl", title: "Garage Door Controls", multiple: true, required: false
		input "geolocations", "capability.geolocation", title: "Geolocations", multiple: true, required: false
		input "holdableButtons", "capability.holdableButton", title: "Holdable Buttons", multiple: true, required: false
		input "illuminanceMeasurements", "capability.illuminanceMeasurement", title: "Illuminance Measurements", multiple: true, required: false
		input "imageCaptures", "capability.imageCapture", title: "Image Captures", multiple: true, required: false
		input "indicators", "capability.indicator", title: "Indicators", multiple: true, required: false
		input "infraredLevels", "capability.infraredLevel", title: "Infrared Levels", multiple: true, required: false
		input "lights", "capability.light", title: "Lights", multiple: true, required: false
		input "lockOnlies", "capability.lockOnly", title: "Lock Onlies", multiple: true, required: false
		input "locks", "capability.lock", title: "Locks", multiple: true, required: false
		input "mediaInputSources", "capability.mediaInputSource", title: "Media Input Sources", multiple: true, required: false
		input "mediaPlaybackRepeats", "capability.mediaPlaybackRepeat", title: "Media Playback Repeats", multiple: true, required: false
		input "mediaPlaybackShuffles", "capability.mediaPlaybackShuffle", title: "Media Playback Shuffles", multiple: true, required: false
		input "mediaPlaybacks", "capability.mediaPlayback", title: "Media Playbacks", multiple: true, required: false
		input "mediaPresets", "capability.mediaPresets", title: "Media Presets", multiple: true, required: false
		input "motionSensors", "capability.motionSensor", title: "Motion Sensors", multiple: true, required: false
		input "musicPlayers", "capability.musicPlayer", title: "Music Players", multiple: true, required: false
		input "odorSensors", "capability.odorSensor", title: "Odor Sensors", multiple: true, required: false
		input "outlets", "capability.outlet", title: "Outlets", multiple: true, required: false
		input "ovenModes", "capability.ovenMode", title: "Oven Modes", multiple: true, required: false
		input "ovenOperatingStates", "capability.ovenOperatingState", title: "Oven Operating States", multiple: true, required: false
		input "ovenSetpoints", "capability.ovenSetpoint", title: "Oven Setpoints", multiple: true, required: false
		input "pHMeasurements", "capability.pHMeasurement", title: "pH Measurements", multiple: true, required: false
		input "powerConsumptionReports", "capability.powerConsumptionReport", title: "Power Consumption Reports", multiple: true, required: false
		input "powerMeters", "capability.powerMeter", title: "Power Meters", multiple: true, required: false
		input "powerSources", "capability.powerSource", title: "Power Sources", multiple: true, required: false
		input "presenceSensors", "capability.presenceSensor", title: "Presence Sensors", multiple: true, required: false
		input "rapidCoolings", "capability.rapidCooling", title: "Rapid Coolings", multiple: true, required: false
		input "refrigerationSetpoints", "capability.refrigerationSetpoint", title: "Refrigeration Setpoints", multiple: true, required: false
		input "relativeHumidityMeasurements", "capability.relativeHumidityMeasurement", title: "Relative Humidity Measurements", multiple: true, required: false
		input "relaySwitchs", "capability.relaySwitch", title: "Relay Switchs", multiple: true, required: false
		input "robotCleanerCleaningModes", "capability.robotCleanerCleaningMode", title: "Robot Cleaner Cleaning Modes", multiple: true, required: false
		input "robotCleanerMovements", "capability.robotCleanerMovement", title: "Robot Cleaner Movements", multiple: true, required: false
		input "robotCleanerTurboModes", "capability.robotCleanerTurboMode", title: "Robot Cleaner Turbo Modes", multiple: true, required: false
		input "shockSensors", "capability.shockSensor", title: "Shock Sensors", multiple: true, required: false
		input "signalStrengths", "capability.signalStrength", title: "Signal Strengths", multiple: true, required: false
		input "sleepSensors", "capability.sleepSensor", title: "Sleep Sensors", multiple: true, required: false
		input "smokeDetectors", "capability.smokeDetector", title: "Smoke Detectors", multiple: true, required: false
		input "soundPressureLevels", "capability.soundPressureLevel", title: "Sound Pressure Levels", multiple: true, required: false
		input "soundSensors", "capability.soundSensor", title: "Sound Sensors", multiple: true, required: false
		input "speechRecognitions", "capability.speechRecognition", title: "Speech Recognitions", multiple: true, required: false
		input "stepSensors", "capability.stepSensor", title: "Step Sensors", multiple: true, required: false
		input "switchLevels", "capability.switchLevel", title: "Switch Levels", multiple: true, required: false
		input "switches", "capability.switch", title: "Switchs", multiple: true, required: false
		input "tamperAlerts", "capability.tamperAlert", title: "Tamper Alerts", multiple: true, required: false
		input "temperatureMeasurements", "capability.temperatureMeasurement", title: "Temperature Measurements", multiple: true, required: false
		input "thermostatCoolingSetpoints", "capability.thermostatCoolingSetpoint", title: "Thermostat Cooling Setpoints", multiple: true, required: false
		input "thermostatFanModes", "capability.thermostatFanMode", title: "Thermostat Fan Modes", multiple: true, required: false
		input "thermostatHeatingSetpoints", "capability.thermostatHeatingSetpoint", title: "Thermostat Heating Setpoints", multiple: true, required: false
		input "thermostatModes", "capability.thermostatMode", title: "Thermostat Modes", multiple: true, required: false
		input "thermostatOperatingStates", "capability.thermostatOperatingState", title: "Thermostat Operating States", multiple: true, required: false
		input "thermostatSetpoints", "capability.thermostatSetpoint", title: "Thermostat Setpoints", multiple: true, required: false
		input "thermostats", "capability.thermostat", title: "Thermostats", multiple: true, required: false
		input "threeAxis", "capability.threeAxis", title: "Three Axis", multiple: true, required: false
		input "timedSessions", "capability.timedSession", title: "Timed Sessions", multiple: true, required: false
		input "touchSensors", "capability.touchSensor", title: "Touch Sensors", multiple: true, required: false
		input "tvChannels", "capability.tvChannel", title: "Tv Channels", multiple: true, required: false
		input "ultravioletIndexs", "capability.ultravioletIndex", title: "Ultraviolet Indexs", multiple: true, required: false
		input "valves", "capability.valve", title: "Valves", multiple: true, required: false
		input "videoClips", "capability.videoClips", title: "Video Clips", multiple: true, required: false
		input "videoStreams", "capability.videoStream", title: "Video Streams", multiple: true, required: false
		input "voltageMeasurements", "capability.voltageMeasurement", title: "Voltage Measurements", multiple: true, required: false
		input "washerModes", "capability.washerMode", title: "Washer Modes", multiple: true, required: false
		input "washerOperatingStates", "capability.washerOperatingState", title: "Washer Operating States", multiple: true, required: false
		input "waterSensors", "capability.waterSensor", title: "Water Sensors", multiple: true, required: false
		input "windowShades", "capability.windowShade", title: "Window Shades", multiple: true, required: false
	}
}

mappings {
	path("/all"){action: [GET: "listAll"]}
}

def listAll() {
	
    def resp = []

	accelerationSensors.each {
		resp << [name: it.name, label: it.label, capability: "acceleration", lastActivity: it.lastActivity, value: it.currentValue("acceleration")]
	}
	airConditionerModes.each {
		resp << [name: it.name, label: it.label, capability: "airConditionerMode", lastActivity: it.lastActivity, value: it.currentValue("airConditionerMode")]
	}
	airQualitySensors.each {
		resp << [name: it.name, label: it.label, capability: "airQuality", lastActivity: it.lastActivity, value: it.currentValue("airQuality")]
	}
	alarms.each {
		resp << [name: it.name, label: it.label, capability: "alarm", lastActivity: it.lastActivity, value: it.currentValue("alarm")]
	}
	audioMutes.each {
		resp << [name: it.name, label: it.label, capability: "mute", lastActivity: it.lastActivity, value: it.currentValue("mute")]
	}
	audioTrackDatas.each {
		resp << [name: it.name, label: it.label, capability: "audioTrackData", lastActivity: it.lastActivity, value: it.currentValue("audioTrackData")]
	}
	audioVolumes.each {
		resp << [name: it.name, label: it.label, capability: "volume", lastActivity: it.lastActivity, value: it.currentValue("volume")]
	}
	batteries.each {
		resp << [name: it.name, label: it.label, capability: "battery", lastActivity: it.lastActivity, value: it.currentValue("battery")]
	}
	beacons.each {
		resp << [name: it.name, label: it.label, capability: "presence", lastActivity: it.lastActivity, value: it.currentValue("presence")]
	}
	carbonDioxideMeasurements.each {
		resp << [name: it.name, label: it.label, capability: "carbonDioxide", lastActivity: it.lastActivity, value: it.currentValue("carbonDioxide")]
	}
	carbonMonoxideDetectors.each {
		resp << [name: it.name, label: it.label, capability: "carbonMonoxide", lastActivity: it.lastActivity, value: it.currentValue("carbonMonoxide")]
	}
	colorControls.each {
		resp << [name: it.name, label: it.label, capability: "color", lastActivity: it.lastActivity, value: it.currentValue("color")]
		resp << [name: it.name, label: it.label, capability: "hue", lastActivity: it.lastActivity, value: it.currentValue("hue")]
		resp << [name: it.name, label: it.label, capability: "saturation", lastActivity: it.lastActivity, value: it.currentValue("saturation")]
	}
	colorTemperatures.each {
		resp << [name: it.name, label: it.label, capability: "colorTemperature", lastActivity: it.lastActivity, value: it.currentValue("colorTemperature")]
	}
	colors.each {
		resp << [name: it.name, label: it.label, capability: "colorValue", lastActivity: it.lastActivity, value: it.currentValue("colorValue")]
	}
	colorModes.each {
		resp << [name: it.name, label: it.label, capability: "colorMode", lastActivity: it.lastActivity, value: it.currentValue("colorMode")]
	}
	consumables.each {
		resp << [name: it.name, label: it.label, capability: "consumableStatus", lastActivity: it.lastActivity, value: it.currentValue("consumableStatus")]
	}
	contactSensors.each {
		resp << [name: it.name, label: it.label, capability: "contact", lastActivity: it.lastActivity, value: it.currentValue("contact")]
	}
	demandResponseLoadControls.each {
		resp << [name: it.name, label: it.label, capability: "drlcStatus", lastActivity: it.lastActivity, value: it.currentValue("drlcStatus")]
	}
	dishwasherModes.each {
		resp << [name: it.name, label: it.label, capability: "dishwasherMode", lastActivity: it.lastActivity, value: it.currentValue("dishwasherMode")]
	}
	dishwasherOperatingStates.each {
		resp << [name: it.name, label: it.label, capability: "machineState", lastActivity: it.lastActivity, value: it.currentValue("machineState")]
		resp << [name: it.name, label: it.label, capability: "supportedMachineStates", lastActivity: it.lastActivity, value: it.currentValue("supportedMachineStates")]
		resp << [name: it.name, label: it.label, capability: "dishwasherJobState", lastActivity: it.lastActivity, value: it.currentValue("dishwasherJobState")]
		resp << [name: it.name, label: it.label, capability: "completionTime", lastActivity: it.lastActivity, value: it.currentValue("completionTime")]
	}
	doorControls.each {
		resp << [name: it.name, label: it.label, capability: "door", lastActivity: it.lastActivity, value: it.currentValue("door")]
	}
	dryerModes.each {
		resp << [name: it.name, label: it.label, capability: "dryerMode", lastActivity: it.lastActivity, value: it.currentValue("dryerMode")]
	}
	dryerOperatingStates.each {
		resp << [name: it.name, label: it.label, capability: "machineState", lastActivity: it.lastActivity, value: it.currentValue("machineState")]
		resp << [name: it.name, label: it.label, capability: "supportedMachineStates", lastActivity: it.lastActivity, value: it.currentValue("supportedMachineStates")]
		resp << [name: it.name, label: it.label, capability: "dryerJobState", lastActivity: it.lastActivity, value: it.currentValue("dryerJobState")]
		resp << [name: it.name, label: it.label, capability: "completionTime", lastActivity: it.lastActivity, value: it.currentValue("completionTime")]
	}
	dustSensors.each {
		resp << [name: it.name, label: it.label, capability: "fineDustLevel", lastActivity: it.lastActivity, value: it.currentValue("fineDustLevel")]
		resp << [name: it.name, label: it.label, capability: "dustLevel", lastActivity: it.lastActivity, value: it.currentValue("dustLevel")]
	}
	energyMeters.each {
		resp << [name: it.name, label: it.label, capability: "energy", lastActivity: it.lastActivity, value: it.currentValue("energy")]
	}
	estimatedTimeOfArrivals.each {
		resp << [name: it.name, label: it.label, capability: "eta", lastActivity: it.lastActivity, value: it.currentValue("eta")]
	}
	executes.each {
		resp << [name: it.name, label: it.label, capability: "data", lastActivity: it.lastActivity, value: it.currentValue("data")]
	}
	fanSpeeds.each {
		resp << [name: it.name, label: it.label, capability: "fanSpeed", lastActivity: it.lastActivity, value: it.currentValue("fanSpeed")]
	}
	filterStatus.each {
		resp << [name: it.name, label: it.label, capability: "filterStatus", lastActivity: it.lastActivity, value: it.currentValue("filterStatus")]
	}
	garageDoorControls.each {
		resp << [name: it.name, label: it.label, capability: "door", lastActivity: it.lastActivity, value: it.currentValue("door")]
	}
	geolocations.each {
		resp << [name: it.name, label: it.label, capability: "latitude", lastActivity: it.lastActivity, value: it.currentValue("latitude")]
		resp << [name: it.name, label: it.label, capability: "longitude", lastActivity: it.lastActivity, value: it.currentValue("longitude")]
		resp << [name: it.name, label: it.label, capability: "method", lastActivity: it.lastActivity, value: it.currentValue("method")]
		resp << [name: it.name, label: it.label, capability: "accuracy", lastActivity: it.lastActivity, value: it.currentValue("accuracy")]
		resp << [name: it.name, label: it.label, capability: "altitudeAccuracy", lastActivity: it.lastActivity, value: it.currentValue("altitudeAccuracy")]
		resp << [name: it.name, label: it.label, capability: "heading", lastActivity: it.lastActivity, value: it.currentValue("heading")]
		resp << [name: it.name, label: it.label, capability: "speed", lastActivity: it.lastActivity, value: it.currentValue("speed")]
		resp << [name: it.name, label: it.label, capability: "lastUpdateTime", lastActivity: it.lastActivity, value: it.currentValue("lastUpdateTime")]
	}
	holdableButtons.each {
		resp << [name: it.name, label: it.label, capability: "button", lastActivity: it.lastActivity, value: it.currentValue("button")]
		resp << [name: it.name, label: it.label, capability: "numberOfButtons", lastActivity: it.lastActivity, value: it.currentValue("numberOfButtons")]
	}
	illuminanceMeasurements.each {
		resp << [name: it.name, label: it.label, capability: "illuminance", lastActivity: it.lastActivity, value: it.currentValue("illuminance")]
	}
	imageCaptures.each {
		resp << [name: it.name, label: it.label, capability: "image", lastActivity: it.lastActivity, value: it.currentValue("image")]
	}
	indicators.each {
		resp << [name: it.name, label: it.label, capability: "indicatorStatus", lastActivity: it.lastActivity, value: it.currentValue("indicatorStatus")]
	}
	infraredLevels.each {
		resp << [name: it.name, label: it.label, capability: "infraredLevel", lastActivity: it.lastActivity, value: it.currentValue("infraredLevel")]
	}
	lights.each {
		resp << [name: it.name, label: it.label, capability: "switch", lastActivity: it.lastActivity, value: it.currentValue("switch")]
	}
	lockOnlies.each {
		resp << [name: it.name, label: it.label, capability: "lock", lastActivity: it.lastActivity, value: it.currentValue("lock")]
	}
	locks.each {
		resp << [name: it.name, label: it.label, capability: "lock", lastActivity: it.lastActivity, value: it.currentValue("lock")]
	}
	mediaInputSources.each {
		resp << [name: it.name, label: it.label, capability: "inputSource", lastActivity: it.lastActivity, value: it.currentValue("inputSource")]
		resp << [name: it.name, label: it.label, capability: "supportedInputSources", lastActivity: it.lastActivity, value: it.currentValue("supportedInputSources")]
	}
	mediaPlaybackRepeats.each {
		resp << [name: it.name, label: it.label, capability: "playbackRepeatMode", lastActivity: it.lastActivity, value: it.currentValue("playbackRepeatMode")]
	}
	mediaPlaybackShuffles.each {
		resp << [name: it.name, label: it.label, capability: "playbackShuffle", lastActivity: it.lastActivity, value: it.currentValue("playbackShuffle")]
	}
	mediaPlaybacks.each {
		resp << [name: it.name, label: it.label, capability: "level", lastActivity: it.lastActivity, value: it.currentValue("level")]
		resp << [name: it.name, label: it.label, capability: "playbackStatus", lastActivity: it.lastActivity, value: it.currentValue("playbackStatus")]
	}
	mediaPresets.each {
		resp << [name: it.name, label: it.label, capability: "presets", lastActivity: it.lastActivity, value: it.currentValue("presets")]
	}
	motionSensors.each {
		resp << [name: it.name, label: it.label, capability: "motion", lastActivity: it.lastActivity, value: it.currentValue("motion")]
	}
	musicPlayers.each {
		resp << [name: it.name, label: it.label, capability: "level", lastActivity: it.lastActivity, value: it.currentValue("level")]
		resp << [name: it.name, label: it.label, capability: "mute", lastActivity: it.lastActivity, value: it.currentValue("mute")]
		resp << [name: it.name, label: it.label, capability: "status", lastActivity: it.lastActivity, value: it.currentValue("status")]
		resp << [name: it.name, label: it.label, capability: "trackData", lastActivity: it.lastActivity, value: it.currentValue("trackData")]
		resp << [name: it.name, label: it.label, capability: "trackDescription", lastActivity: it.lastActivity, value: it.currentValue("trackDescription")]
	}
	odorSensors.each {
		resp << [name: it.name, label: it.label, capability: "odorLevel", lastActivity: it.lastActivity, value: it.currentValue("odorLevel")]
	}
	outlets.each {
		resp << [name: it.name, label: it.label, capability: "switch", lastActivity: it.lastActivity, value: it.currentValue("switch")]
	}
	ovenModes.each {
		resp << [name: it.name, label: it.label, capability: "ovenMode", lastActivity: it.lastActivity, value: it.currentValue("ovenMode")]
	}
	ovenOperatingStates.each {
		resp << [name: it.name, label: it.label, capability: "machineState", lastActivity: it.lastActivity, value: it.currentValue("machineState")]
		resp << [name: it.name, label: it.label, capability: "supportedMachineStates", lastActivity: it.lastActivity, value: it.currentValue("supportedMachineStates")]
		resp << [name: it.name, label: it.label, capability: "ovenJobState", lastActivity: it.lastActivity, value: it.currentValue("ovenJobState")]
		resp << [name: it.name, label: it.label, capability: "completionTime", lastActivity: it.lastActivity, value: it.currentValue("completionTime")]
		resp << [name: it.name, label: it.label, capability: "operationTime", lastActivity: it.lastActivity, value: it.currentValue("operationTime")]
	}
	ovenSetpoints.each {
		resp << [name: it.name, label: it.label, capability: "ovenSetpoint", lastActivity: it.lastActivity, value: it.currentValue("ovenSetpoint")]
	}
	pHMeasurements.each {
		resp << [name: it.name, label: it.label, capability: "pH", lastActivity: it.lastActivity, value: it.currentValue("pH")]
	}
	powerConsumptionReports.each {
		resp << [name: it.name, label: it.label, capability: "powerConsumption", lastActivity: it.lastActivity, value: it.currentValue("powerConsumption")]
	}
	powerMeters.each {
		resp << [name: it.name, label: it.label, capability: "power", lastActivity: it.lastActivity, value: it.currentValue("power")]
	}
	powerSources.each {
		resp << [name: it.name, label: it.label, capability: "powerSource", lastActivity: it.lastActivity, value: it.currentValue("powerSource")]
	}
	presenceSensors.each {
		resp << [name: it.name, label: it.label, capability: "presence", lastActivity: it.lastActivity, value: it.currentValue("presence")]
	}
	rapidCoolings.each {
		resp << [name: it.name, label: it.label, capability: "rapidCooling", lastActivity: it.lastActivity, value: it.currentValue("rapidCooling")]
	}
	refrigerationSetpoints.each {
		resp << [name: it.name, label: it.label, capability: "refrigerationSetpoint", lastActivity: it.lastActivity, value: it.currentValue("refrigerationSetpoint")]
	}
	relativeHumidityMeasurements.each {
		resp << [name: it.name, label: it.label, capability: "humidity", lastActivity: it.lastActivity, value: it.currentValue("humidity")]
	}
	relaySwitches.each {
		resp << [name: it.name, label: it.label, capability: "switch", lastActivity: it.lastActivity, value: it.currentValue("switch")]
	}
	robotCleanerCleaningModes.each {
		resp << [name: it.name, label: it.label, capability: "robotCleanerCleaningMode", lastActivity: it.lastActivity, value: it.currentValue("robotCleanerCleaningMode")]
	}
	robotCleanerMovements.each {
		resp << [name: it.name, label: it.label, capability: "robotCleanerMovement", lastActivity: it.lastActivity, value: it.currentValue("robotCleanerMovement")]
	}
	robotCleanerTurboModes.each {
		resp << [name: it.name, label: it.label, capability: "robotCleanerTurboMode", lastActivity: it.lastActivity, value: it.currentValue("robotCleanerTurboMode")]
	}
	shockSensors.each {
		resp << [name: it.name, label: it.label, capability: "shock", lastActivity: it.lastActivity, value: it.currentValue("shock")]
	}
	signalStrengths.each {
		resp << [name: it.name, label: it.label, capability: "lqi", lastActivity: it.lastActivity, value: it.currentValue("lqi")]
		resp << [name: it.name, label: it.label, capability: "rssi", lastActivity: it.lastActivity, value: it.currentValue("rssi")]
	}
	sleepSensors.each {
		resp << [name: it.name, label: it.label, capability: "sleeping", lastActivity: it.lastActivity, value: it.currentValue("sleeping")]
	}
	smokeDetectors.each {
		resp << [name: it.name, label: it.label, capability: "smoke", lastActivity: it.lastActivity, value: it.currentValue("smoke")]
	}
	soundPressureLevels.each {
		resp << [name: it.name, label: it.label, capability: "soundPressureLevel", lastActivity: it.lastActivity, value: it.currentValue("soundPressureLevel")]
	}
	soundSensors.each {
		resp << [name: it.name, label: it.label, capability: "sound", lastActivity: it.lastActivity, value: it.currentValue("sound")]
	}
	speechRecognitions.each {
		resp << [name: it.name, label: it.label, capability: "phraseSpoken", lastActivity: it.lastActivity, value: it.currentValue("phraseSpoken")]
	}
	stepSensors.each {
		resp << [name: it.name, label: it.label, capability: "goal", lastActivity: it.lastActivity, value: it.currentValue("goal")]
		resp << [name: it.name, label: it.label, capability: "steps", lastActivity: it.lastActivity, value: it.currentValue("steps")]
	}
	switchLevels.each {
		resp << [name: it.name, label: it.label, capability: "level", lastActivity: it.lastActivity, value: it.currentValue("level")]
	}
	switchs.each {
		resp << [name: it.name, label: it.label, capability: "switch", lastActivity: it.lastActivity, value: it.currentValue("switch")]
	}
	tamperAlerts.each {
		resp << [name: it.name, label: it.label, capability: "tamper", lastActivity: it.lastActivity, value: it.currentValue("tamper")]
	}
	temperatureMeasurements.each {
		resp << [name: it.name, label: it.label, capability: "temperature", lastActivity: it.lastActivity, value: it.currentValue("temperature")]
	}
	thermostatCoolingSetpoints.each {
		resp << [name: it.name, label: it.label, capability: "coolingSetpoint", lastActivity: it.lastActivity, value: it.currentValue("coolingSetpoint")]
	}
	thermostatFanModes.each {
		resp << [name: it.name, label: it.label, capability: "thermostatFanMode", lastActivity: it.lastActivity, value: it.currentValue("thermostatFanMode")]
		resp << [name: it.name, label: it.label, capability: "supportedThermostatFanModes", lastActivity: it.lastActivity, value: it.currentValue("supportedThermostatFanModes")]
	}
	thermostatHeatingSetpoints.each {
		resp << [name: it.name, label: it.label, capability: "heatingSetpoint", lastActivity: it.lastActivity, value: it.currentValue("heatingSetpoint")]
	}
	thermostatModes.each {
		resp << [name: it.name, label: it.label, capability: "thermostatMode", lastActivity: it.lastActivity, value: it.currentValue("thermostatMode")]
		resp << [name: it.name, label: it.label, capability: "supportedThermostatModes", lastActivity: it.lastActivity, value: it.currentValue("supportedThermostatModes")]
	}
	thermostatOperatingStates.each {
		resp << [name: it.name, label: it.label, capability: "thermostatOperatingState", lastActivity: it.lastActivity, value: it.currentValue("thermostatOperatingState")]
	}
	thermostatSetpoints.each {
		resp << [name: it.name, label: it.label, capability: "thermostatSetpoint", lastActivity: it.lastActivity, value: it.currentValue("thermostatSetpoint")]
	}
	thermostats.each {
		resp << [name: it.name, label: it.label, capability: "coolingSetpoint", lastActivity: it.lastActivity, value: it.currentValue("coolingSetpoint")]
		resp << [name: it.name, label: it.label, capability: "coolingSetpointRange", lastActivity: it.lastActivity, value: it.currentValue("coolingSetpointRange")]
		resp << [name: it.name, label: it.label, capability: "heatingSetpoint", lastActivity: it.lastActivity, value: it.currentValue("heatingSetpoint")]
		resp << [name: it.name, label: it.label, capability: "heatingSetpointRange", lastActivity: it.lastActivity, value: it.currentValue("heatingSetpointRange")]
		resp << [name: it.name, label: it.label, capability: "schedule", lastActivity: it.lastActivity, value: it.currentValue("schedule")]
		resp << [name: it.name, label: it.label, capability: "temperature", lastActivity: it.lastActivity, value: it.currentValue("temperature")]
		resp << [name: it.name, label: it.label, capability: "thermostatFanMode", lastActivity: it.lastActivity, value: it.currentValue("thermostatFanMode")]
		resp << [name: it.name, label: it.label, capability: "supportedThermostatFanModes", lastActivity: it.lastActivity, value: it.currentValue("supportedThermostatFanModes")]
		resp << [name: it.name, label: it.label, capability: "thermostatMode", lastActivity: it.lastActivity, value: it.currentValue("thermostatMode")]
		resp << [name: it.name, label: it.label, capability: "supportedThermostatModes", lastActivity: it.lastActivity, value: it.currentValue("supportedThermostatModes")]
		resp << [name: it.name, label: it.label, capability: "thermostatOperatingState", lastActivity: it.lastActivity, value: it.currentValue("thermostatOperatingState")]
		resp << [name: it.name, label: it.label, capability: "thermostatSetpoint", lastActivity: it.lastActivity, value: it.currentValue("thermostatSetpoint")]
	}
	threeAxis.each {
		resp << [name: it.name, label: it.label, capability: "threeAxis", lastActivity: it.lastActivity, value: it.currentValue("threeAxis")]
	}
	timedSessions.each {
		resp << [name: it.name, label: it.label, capability: "sessionStatus", lastActivity: it.lastActivity, value: it.currentValue("sessionStatus")]
		resp << [name: it.name, label: it.label, capability: "completionTime", lastActivity: it.lastActivity, value: it.currentValue("completionTime")]
	}
	touchSensors.each {
		resp << [name: it.name, label: it.label, capability: "touch", lastActivity: it.lastActivity, value: it.currentValue("touch")]
	}
	tvChannels.each {
		resp << [name: it.name, label: it.label, capability: "tvChannel", lastActivity: it.lastActivity, value: it.currentValue("tvChannel")]
	}
	ultravioletIndexs.each {
		resp << [name: it.name, label: it.label, capability: "ultravioletIndex", lastActivity: it.lastActivity, value: it.currentValue("ultravioletIndex")]
	}
	valves.each {
		resp << [name: it.name, label: it.label, capability: "valve", lastActivity: it.lastActivity, value: it.currentValue("valve")]
	}
	videoClips.each {
		resp << [name: it.name, label: it.label, capability: "videoClip", lastActivity: it.lastActivity, value: it.currentValue("videoClip")]
	}
	videoStreams.each {
		resp << [name: it.name, label: it.label, capability: "stream", lastActivity: it.lastActivity, value: it.currentValue("stream")]
	}
	voltageMeasurements.each {
		resp << [name: it.name, label: it.label, capability: "voltage", lastActivity: it.lastActivity, value: it.currentValue("voltage")]
	}
	washerModes.each {
		resp << [name: it.name, label: it.label, capability: "washerMode", lastActivity: it.lastActivity, value: it.currentValue("washerMode")]
	}
	washerOperatingStates.each {
		resp << [name: it.name, label: it.label, capability: "machineState", lastActivity: it.lastActivity, value: it.currentValue("machineState")]
		resp << [name: it.name, label: it.label, capability: "supportedMachineStates", lastActivity: it.lastActivity, value: it.currentValue("supportedMachineStates")]
		resp << [name: it.name, label: it.label, capability: "washerJobState", lastActivity: it.lastActivity, value: it.currentValue("washerJobState")]
		resp << [name: it.name, label: it.label, capability: "completionTime", lastActivity: it.lastActivity, value: it.currentValue("completionTime")]
	}
	waterSensors.each {
		resp << [name: it.name, label: it.label, capability: "water", lastActivity: it.lastActivity, value: it.currentValue("water")]
	}
	windowShades.each {
		resp << [name: it.name, label: it.label, capability: "windowShade", lastActivity: it.lastActivity, value: it.currentValue("windowShade")]
	}


    return resp
}

def installed() {}

def updated() {}