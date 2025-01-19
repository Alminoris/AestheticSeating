package net.alminoris.aestheticseating.util.helper;

public class ModJsonTemplates
{
    public static final String SIMPLE_CHAIR_TEMPLATE = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [64, 64],
            	"textures": {
            		"0": "aestheticseating:block/simple_chair_WOOD_NAME_VALUE",
            		"particle": "aestheticseating:block/simple_chair_WOOD_NAME_VALUE"
            	},
            	"elements": [
            		{
            			"name": "leg1",
            			"from": [3.5, 0, 3.5],
            			"to": [5, 7, 5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3.25, 0, 3.25]},
            			"faces": {
            				"north": {"uv": [2.5, 4.5, 3, 6.25], "texture": "#0"},
            				"east": {"uv": [3, 4.5, 3.5, 6.25], "texture": "#0"},
            				"south": {"uv": [3.5, 4.5, 4, 6.25], "texture": "#0"},
            				"west": {"uv": [4, 4.5, 4.5, 6.25], "texture": "#0"},
            				"up": {"uv": [6.75, 6.75, 6.25, 6.25], "texture": "#0"},
            				"down": {"uv": [3.75, 6.5, 3.25, 7], "texture": "#0"}
            			}
            		},
            		{
            			"name": "leg2",
            			"from": [3.5, 0, 11],
            			"to": [5, 7, 12.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3.25, 0, 10.75]},
            			"faces": {
            				"north": {"uv": [4.5, 4.5, 5, 6.25], "texture": "#0"},
            				"east": {"uv": [0, 5, 0.5, 6.75], "texture": "#0"},
            				"south": {"uv": [5, 0, 5.5, 1.75], "texture": "#0"},
            				"west": {"uv": [0.5, 5, 1, 6.75], "texture": "#0"},
            				"up": {"uv": [4.25, 7, 3.75, 6.5], "texture": "#0"},
            				"down": {"uv": [4.75, 6.5, 4.25, 7], "texture": "#0"}
            			}
            		},
            		{
            			"name": "leg3",
            			"from": [11, 0, 11],
            			"to": [12.5, 7, 12.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [10.75, 0, 10.75]},
            			"faces": {
            				"north": {"uv": [1, 5, 1.5, 6.75], "texture": "#0"},
            				"east": {"uv": [1.5, 5, 2, 6.75], "texture": "#0"},
            				"south": {"uv": [5, 1.75, 5.5, 3.5], "texture": "#0"},
            				"west": {"uv": [2, 5, 2.5, 6.75], "texture": "#0"},
            				"up": {"uv": [0.5, 7.25, 0, 6.75], "texture": "#0"},
            				"down": {"uv": [1, 6.75, 0.5, 7.25], "texture": "#0"}
            			}
            		},
            		{
            			"name": "leg4",
            			"from": [11, 0, 3.5],
            			"to": [12.5, 7, 5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [10.75, 0, 3.25]},
            			"faces": {
            				"north": {"uv": [5, 3.5, 5.5, 5.25], "texture": "#0"},
            				"east": {"uv": [5, 5.25, 5.5, 7], "texture": "#0"},
            				"south": {"uv": [5.5, 0, 6, 1.75], "texture": "#0"},
            				"west": {"uv": [5.5, 1.75, 6, 3.5], "texture": "#0"},
            				"up": {"uv": [1.5, 7.25, 1, 6.75], "texture": "#0"},
            				"down": {"uv": [2, 6.75, 1.5, 7.25], "texture": "#0"}
            			}
            		},
            		{
            			"name": "seat",
            			"from": [3.2, 7, 4],
            			"to": [12.8, 8, 13],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 7, 3]},
            			"faces": {
            				"north": {"uv": [6, 1.5, 8.5, 1.75], "texture": "#0"},
            				"east": {"uv": [6, 2.5, 8.25, 2.75], "texture": "#0"},
            				"south": {"uv": [6, 1.75, 8.5, 2], "texture": "#0"},
            				"west": {"uv": [6, 2.75, 8.25, 3], "texture": "#0"},
            				"up": {"uv": [5, 2.25, 2.5, 0], "texture": "#0"},
            				"down": {"uv": [5, 2.25, 2.5, 4.5], "texture": "#0"}
            			}
            		},
            		{
            			"name": "back",
            			"from": [3.25, 7, 3],
            			"to": [12.75, 17, 4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 7, 3]},
            			"faces": {
            				"north": {"uv": [0, 0, 2.5, 2.5], "texture": "#0"},
            				"east": {"uv": [5.5, 6, 5.75, 8.5], "texture": "#0"},
            				"south": {"uv": [0, 2.5, 2.5, 5], "texture": "#0"},
            				"west": {"uv": [5.75, 6, 6, 8.5], "texture": "#0"},
            				"up": {"uv": [8.5, 2.25, 6, 2], "texture": "#0"},
            				"down": {"uv": [8.5, 2.25, 6, 2.5], "texture": "#0"}
            			}
            		},
            		{
            			"name": "support1",
            			"from": [3.85, 5.25, 5],
            			"to": [4.65, 7, 11],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 5, 9]},
            			"faces": {
            				"north": {"uv": [4.75, 6.25, 5, 6.75], "texture": "#0"},
            				"east": {"uv": [5.5, 3.5, 7, 4], "texture": "#0"},
            				"south": {"uv": [2, 6.75, 2.25, 7.25], "texture": "#0"},
            				"west": {"uv": [5.5, 4, 7, 4.5], "texture": "#0"},
            				"up": {"uv": [6.25, 7.5, 6, 6], "texture": "#0"},
            				"down": {"uv": [2.75, 6.25, 2.5, 7.75], "texture": "#0"}
            			}
            		},
            		{
            			"name": "support2",
            			"from": [11.35, 5.25, 5],
            			"to": [12.15, 7, 11],
            			"rotation": {"angle": 0, "axis": "y", "origin": [10.5, 5, 9]},
            			"faces": {
            				"north": {"uv": [2.25, 6.75, 2.5, 7.25], "texture": "#0"},
            				"east": {"uv": [5.5, 4.5, 7, 5], "texture": "#0"},
            				"south": {"uv": [4.75, 6.75, 5, 7.25], "texture": "#0"},
            				"west": {"uv": [5.5, 5, 7, 5.5], "texture": "#0"},
            				"up": {"uv": [3, 7.75, 2.75, 6.25], "texture": "#0"},
            				"down": {"uv": [3.25, 6.25, 3, 7.75], "texture": "#0"}
            			}
            		},
            		{
            			"name": "support3",
            			"from": [5, 5.25, 11.35],
            			"to": [11, 7, 12.15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4.25, 5, 15.25]},
            			"faces": {
            				"north": {"uv": [5.5, 5.5, 7, 6], "texture": "#0"},
            				"east": {"uv": [6.25, 6.75, 6.5, 7.25], "texture": "#0"},
            				"south": {"uv": [6, 0, 7.5, 0.5], "texture": "#0"},
            				"west": {"uv": [6.75, 6.25, 7, 6.75], "texture": "#0"},
            				"up": {"uv": [7.5, 3.25, 6, 3], "texture": "#0"},
            				"down": {"uv": [7.5, 3.25, 6, 3.5], "texture": "#0"}
            			}
            		},
            		{
            			"name": "support4",
            			"from": [5, 5.25, 3.85],
            			"to": [11, 7, 4.65],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4.25, 5, 7.75]},
            			"faces": {
            				"north": {"uv": [6, 0.5, 7.5, 1], "texture": "#0"},
            				"east": {"uv": [6.5, 6.75, 6.75, 7.25], "texture": "#0"},
            				"south": {"uv": [6, 1, 7.5, 1.5], "texture": "#0"},
            				"west": {"uv": [6.75, 6.75, 7, 7.25], "texture": "#0"},
            				"up": {"uv": [4.75, 6.5, 3.25, 6.25], "texture": "#0"},
            				"down": {"uv": [7.75, 6, 6.25, 6.25], "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_righthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_lefthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"ground": {
            			"translation": [0, 2.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [0, -0.25, 0],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"fixed": {
            			"rotation": [0, 90, 0],
            			"translation": [0, 0, 1],
            			"scale": [0.6, 0.6, 0.6]
            		}
            	},
            	"groups": [
            		{
            			"name": "chair_shape",
            			"origin": [4.25, 5, 7.75],
            			"color": 0,
            			"children": [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
            		}
            	]
            }
            """;

    public static final String SIMPLE_CHAIR_CARPETED_TEMPLATE = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [32, 32],
            	"textures": {
            		"0": "aestheticseating:block/simple_chair_WOOD_NAME_VALUE",
            		"1": "aestheticseating:block/simple_chair_COLOR_NAME_VALUE",
            		"particle": "aestheticseating:block/simple_chair_WOOD_NAME_VALUE"
            	},
            	"elements": [
            		{
            			"name": "leg1",
            			"from": [3.5, 0, 3.5],
            			"to": [5, 7, 5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3.25, 0, 3.25]},
            			"faces": {
            				"north": {"uv": [2.5, 4.5, 3, 6.25], "texture": "#0"},
            				"east": {"uv": [3, 4.5, 3.5, 6.25], "texture": "#0"},
            				"south": {"uv": [3.5, 4.5, 4, 6.25], "texture": "#0"},
            				"west": {"uv": [4, 4.5, 4.5, 6.25], "texture": "#0"},
            				"up": {"uv": [6.75, 6.75, 6.25, 6.25], "texture": "#0"},
            				"down": {"uv": [3.75, 6.5, 3.25, 7], "texture": "#0"}
            			}
            		},
            		{
            			"name": "leg2",
            			"from": [3.5, 0, 11],
            			"to": [5, 7, 12.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3.25, 0, 10.75]},
            			"faces": {
            				"north": {"uv": [4.5, 4.5, 5, 6.25], "texture": "#0"},
            				"east": {"uv": [0, 5, 0.5, 6.75], "texture": "#0"},
            				"south": {"uv": [5, 0, 5.5, 1.75], "texture": "#0"},
            				"west": {"uv": [0.5, 5, 1, 6.75], "texture": "#0"},
            				"up": {"uv": [4.25, 7, 3.75, 6.5], "texture": "#0"},
            				"down": {"uv": [4.75, 6.5, 4.25, 7], "texture": "#0"}
            			}
            		},
            		{
            			"name": "leg3",
            			"from": [11, 0, 11],
            			"to": [12.5, 7, 12.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [10.75, 0, 10.75]},
            			"faces": {
            				"north": {"uv": [1, 5, 1.5, 6.75], "texture": "#0"},
            				"east": {"uv": [1.5, 5, 2, 6.75], "texture": "#0"},
            				"south": {"uv": [5, 1.75, 5.5, 3.5], "texture": "#0"},
            				"west": {"uv": [2, 5, 2.5, 6.75], "texture": "#0"},
            				"up": {"uv": [0.5, 7.25, 0, 6.75], "texture": "#0"},
            				"down": {"uv": [1, 6.75, 0.5, 7.25], "texture": "#0"}
            			}
            		},
            		{
            			"name": "leg4",
            			"from": [11, 0, 3.5],
            			"to": [12.5, 7, 5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [10.75, 0, 3.25]},
            			"faces": {
            				"north": {"uv": [5, 3.5, 5.5, 5.25], "texture": "#0"},
            				"east": {"uv": [5, 5.25, 5.5, 7], "texture": "#0"},
            				"south": {"uv": [5.5, 0, 6, 1.75], "texture": "#0"},
            				"west": {"uv": [5.5, 1.75, 6, 3.5], "texture": "#0"},
            				"up": {"uv": [1.5, 7.25, 1, 6.75], "texture": "#0"},
            				"down": {"uv": [2, 6.75, 1.5, 7.25], "texture": "#0"}
            			}
            		},
            		{
            			"name": "seat",
            			"from": [3.2, 7, 4],
            			"to": [12.8, 8, 13],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 7, 3]},
            			"faces": {
            				"north": {"uv": [6, 1.5, 8.5, 1.75], "texture": "#0"},
            				"east": {"uv": [6, 2.5, 8.25, 2.75], "texture": "#0"},
            				"south": {"uv": [6, 1.75, 8.5, 2], "texture": "#0"},
            				"west": {"uv": [6, 2.75, 8.25, 3], "texture": "#0"},
            				"up": {"uv": [5, 2.25, 2.5, 0], "texture": "#0"},
            				"down": {"uv": [5, 2.25, 2.5, 4.5], "texture": "#0"}
            			}
            		},
            		{
            			"name": "back",
            			"from": [3.25, 7, 3],
            			"to": [12.75, 17, 4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 7, 3]},
            			"faces": {
            				"north": {"uv": [0, 0, 2.5, 2.5], "texture": "#0"},
            				"east": {"uv": [5.5, 6, 5.75, 8.5], "texture": "#0"},
            				"south": {"uv": [0, 2.5, 2.5, 5], "texture": "#0"},
            				"west": {"uv": [5.75, 6, 6, 8.5], "texture": "#0"},
            				"up": {"uv": [8.5, 2.25, 6, 2], "texture": "#0"},
            				"down": {"uv": [8.5, 2.25, 6, 2.5], "texture": "#0"}
            			}
            		},
            		{
            			"name": "support1",
            			"from": [3.85, 5.25, 5],
            			"to": [4.65, 7, 11],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 5, 9]},
            			"faces": {
            				"north": {"uv": [4.75, 6.25, 5, 6.75], "texture": "#0"},
            				"east": {"uv": [5.5, 3.5, 7, 4], "texture": "#0"},
            				"south": {"uv": [2, 6.75, 2.25, 7.25], "texture": "#0"},
            				"west": {"uv": [5.5, 4, 7, 4.5], "texture": "#0"},
            				"up": {"uv": [6.25, 7.5, 6, 6], "texture": "#0"},
            				"down": {"uv": [2.75, 6.25, 2.5, 7.75], "texture": "#0"}
            			}
            		},
            		{
            			"name": "support2",
            			"from": [11.35, 5.25, 5],
            			"to": [12.15, 7, 11],
            			"rotation": {"angle": 0, "axis": "y", "origin": [10.5, 5, 9]},
            			"faces": {
            				"north": {"uv": [2.25, 6.75, 2.5, 7.25], "texture": "#0"},
            				"east": {"uv": [5.5, 4.5, 7, 5], "texture": "#0"},
            				"south": {"uv": [4.75, 6.75, 5, 7.25], "texture": "#0"},
            				"west": {"uv": [5.5, 5, 7, 5.5], "texture": "#0"},
            				"up": {"uv": [3, 7.75, 2.75, 6.25], "texture": "#0"},
            				"down": {"uv": [3.25, 6.25, 3, 7.75], "texture": "#0"}
            			}
            		},
            		{
            			"name": "support3",
            			"from": [5, 5.25, 11.35],
            			"to": [11, 7, 12.15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4.25, 5, 15.25]},
            			"faces": {
            				"north": {"uv": [5.5, 5.5, 7, 6], "texture": "#0"},
            				"east": {"uv": [6.25, 6.75, 6.5, 7.25], "texture": "#0"},
            				"south": {"uv": [6, 0, 7.5, 0.5], "texture": "#0"},
            				"west": {"uv": [6.75, 6.25, 7, 6.75], "texture": "#0"},
            				"up": {"uv": [7.5, 3.25, 6, 3], "texture": "#0"},
            				"down": {"uv": [7.5, 3.25, 6, 3.5], "texture": "#0"}
            			}
            		},
            		{
            			"name": "support4",
            			"from": [5, 5.25, 3.85],
            			"to": [11, 7, 4.65],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4.25, 5, 7.75]},
            			"faces": {
            				"north": {"uv": [6, 0.5, 7.5, 1], "texture": "#0"},
            				"east": {"uv": [6.5, 6.75, 6.75, 7.25], "texture": "#0"},
            				"south": {"uv": [6, 1, 7.5, 1.5], "texture": "#0"},
            				"west": {"uv": [6.75, 6.75, 7, 7.25], "texture": "#0"},
            				"up": {"uv": [4.75, 6.5, 3.25, 6.25], "texture": "#0"},
            				"down": {"uv": [7.75, 6, 6.25, 6.25], "texture": "#0"}
            			}
            		},
            		{
            			"from": [3.5, 8, 4.25],
            			"to": [12.5, 8.5, 12.75],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4, 8, 4.75]},
            			"faces": {
            				"north": {"uv": [4.5, 0, 9, 0.5], "texture": "#1"},
            				"east": {"uv": [4.5, 0.5, 9, 1], "texture": "#1"},
            				"south": {"uv": [4.5, 1, 9, 1.5], "texture": "#1"},
            				"west": {"uv": [4.5, 1.5, 9, 2], "texture": "#1"},
            				"up": {"uv": [4.5, 4.5, 0, 0], "texture": "#1"},
            				"down": {"uv": [4.5, 4.5, 0, 9], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_righthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_lefthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"ground": {
            			"translation": [0, 2.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [0, -0.25, 0],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"fixed": {
            			"rotation": [0, 90, 0],
            			"translation": [0, 0, 1],
            			"scale": [0.6, 0.6, 0.6]
            		}
            	},
            	"groups": [
            		{
            			"name": "chair_shape",
            			"origin": [4.25, 5, 7.75],
            			"color": 0,
            			"children": [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
            		},
            		{
            			"name": "carpet",
            			"origin": [8, 8, 8],
            			"color": 0,
            			"children": [10]
            		}
            	]
            }
            """;

    public static final String SIMPLE_CHAIR_RECLINED_TEMPLATE = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [64, 64],
            	"textures": {
            		"0": "aestheticseating:block/simple_chair_WOOD_NAME_VALUE",
            		"particle": "aestheticseating:block/simple_chair_WOOD_NAME_VALUE"
            	},
            	"elements": [
            		{
            			"name": "leg1",
            			"from": [3.5, 0, 3.5],
            			"to": [5, 7, 5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3.25, 0, 3.25]},
            			"faces": {
            				"north": {"uv": [2.5, 4.5, 3, 6.25], "texture": "#0"},
            				"east": {"uv": [3, 4.5, 3.5, 6.25], "texture": "#0"},
            				"south": {"uv": [3.5, 4.5, 4, 6.25], "texture": "#0"},
            				"west": {"uv": [4, 4.5, 4.5, 6.25], "texture": "#0"},
            				"up": {"uv": [6.75, 6.75, 6.25, 6.25], "texture": "#0"},
            				"down": {"uv": [3.75, 6.5, 3.25, 7], "texture": "#0"}
            			}
            		},
            		{
            			"name": "leg2",
            			"from": [3.5, 0, 11],
            			"to": [5, 7, 12.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3.25, 0, 10.75]},
            			"faces": {
            				"north": {"uv": [4.5, 4.5, 5, 6.25], "texture": "#0"},
            				"east": {"uv": [0, 5, 0.5, 6.75], "texture": "#0"},
            				"south": {"uv": [5, 0, 5.5, 1.75], "texture": "#0"},
            				"west": {"uv": [0.5, 5, 1, 6.75], "texture": "#0"},
            				"up": {"uv": [4.25, 7, 3.75, 6.5], "texture": "#0"},
            				"down": {"uv": [4.75, 6.5, 4.25, 7], "texture": "#0"}
            			}
            		},
            		{
            			"name": "leg3",
            			"from": [11, 0, 11],
            			"to": [12.5, 7, 12.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [10.75, 0, 10.75]},
            			"faces": {
            				"north": {"uv": [1, 5, 1.5, 6.75], "texture": "#0"},
            				"east": {"uv": [1.5, 5, 2, 6.75], "texture": "#0"},
            				"south": {"uv": [5, 1.75, 5.5, 3.5], "texture": "#0"},
            				"west": {"uv": [2, 5, 2.5, 6.75], "texture": "#0"},
            				"up": {"uv": [0.5, 7.25, 0, 6.75], "texture": "#0"},
            				"down": {"uv": [1, 6.75, 0.5, 7.25], "texture": "#0"}
            			}
            		},
            		{
            			"name": "leg4",
            			"from": [11, 0, 3.5],
            			"to": [12.5, 7, 5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [10.75, 0, 3.25]},
            			"faces": {
            				"north": {"uv": [5, 3.5, 5.5, 5.25], "texture": "#0"},
            				"east": {"uv": [5, 5.25, 5.5, 7], "texture": "#0"},
            				"south": {"uv": [5.5, 0, 6, 1.75], "texture": "#0"},
            				"west": {"uv": [5.5, 1.75, 6, 3.5], "texture": "#0"},
            				"up": {"uv": [1.5, 7.25, 1, 6.75], "texture": "#0"},
            				"down": {"uv": [2, 6.75, 1.5, 7.25], "texture": "#0"}
            			}
            		},
            		{
            			"name": "seat",
            			"from": [3.2, 7, 4],
            			"to": [12.8, 8, 13],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 7, 3]},
            			"faces": {
            				"north": {"uv": [6, 1.5, 8.5, 1.75], "texture": "#0"},
            				"east": {"uv": [6, 2.5, 8.25, 2.75], "texture": "#0"},
            				"south": {"uv": [6, 1.75, 8.5, 2], "texture": "#0"},
            				"west": {"uv": [6, 2.75, 8.25, 3], "texture": "#0"},
            				"up": {"uv": [5, 2.25, 2.5, 0], "texture": "#0"},
            				"down": {"uv": [5, 2.25, 2.5, 4.5], "texture": "#0"}
            			}
            		},
            		{
            			"name": "back",
            			"from": [3.25, 7, 2],
            			"to": [12.75, 17, 3],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 12, 2.5]},
            			"faces": {
            				"north": {"uv": [0, 2.5, 2.5, 5], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [5.5, 6, 5.75, 8.5], "rotation": 180, "texture": "#0"},
            				"south": {"uv": [0, 0, 2.5, 2.5], "rotation": 180, "texture": "#0"},
            				"west": {"uv": [5.75, 6, 6, 8.5], "rotation": 180, "texture": "#0"},
            				"up": {"uv": [8.5, 2.25, 6, 2.5], "texture": "#0"},
            				"down": {"uv": [8.5, 2.25, 6, 2], "texture": "#0"}
            			}
            		},
            		{
            			"name": "support1",
            			"from": [3.85, 5.25, 5],
            			"to": [4.65, 7, 11],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 5, 9]},
            			"faces": {
            				"north": {"uv": [4.75, 6.25, 5, 6.75], "texture": "#0"},
            				"east": {"uv": [5.5, 3.5, 7, 4], "texture": "#0"},
            				"south": {"uv": [2, 6.75, 2.25, 7.25], "texture": "#0"},
            				"west": {"uv": [5.5, 4, 7, 4.5], "texture": "#0"},
            				"up": {"uv": [6.25, 7.5, 6, 6], "texture": "#0"},
            				"down": {"uv": [2.75, 6.25, 2.5, 7.75], "texture": "#0"}
            			}
            		},
            		{
            			"name": "support2",
            			"from": [11.35, 5.25, 5],
            			"to": [12.15, 7, 11],
            			"rotation": {"angle": 0, "axis": "y", "origin": [10.5, 5, 9]},
            			"faces": {
            				"north": {"uv": [2.25, 6.75, 2.5, 7.25], "texture": "#0"},
            				"east": {"uv": [5.5, 4.5, 7, 5], "texture": "#0"},
            				"south": {"uv": [4.75, 6.75, 5, 7.25], "texture": "#0"},
            				"west": {"uv": [5.5, 5, 7, 5.5], "texture": "#0"},
            				"up": {"uv": [3, 7.75, 2.75, 6.25], "texture": "#0"},
            				"down": {"uv": [3.25, 6.25, 3, 7.75], "texture": "#0"}
            			}
            		},
            		{
            			"name": "support3",
            			"from": [5, 5.25, 11.35],
            			"to": [11, 7, 12.15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4.25, 5, 15.25]},
            			"faces": {
            				"north": {"uv": [5.5, 5.5, 7, 6], "texture": "#0"},
            				"east": {"uv": [6.25, 6.75, 6.5, 7.25], "texture": "#0"},
            				"south": {"uv": [6, 0, 7.5, 0.5], "texture": "#0"},
            				"west": {"uv": [6.75, 6.25, 7, 6.75], "texture": "#0"},
            				"up": {"uv": [7.5, 3.25, 6, 3], "texture": "#0"},
            				"down": {"uv": [7.5, 3.25, 6, 3.5], "texture": "#0"}
            			}
            		},
            		{
            			"name": "support4",
            			"from": [5, 5.25, 3.85],
            			"to": [11, 7, 4.65],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4.25, 5, 7.75]},
            			"faces": {
            				"north": {"uv": [6, 0.5, 7.5, 1], "texture": "#0"},
            				"east": {"uv": [6.5, 6.75, 6.75, 7.25], "texture": "#0"},
            				"south": {"uv": [6, 1, 7.5, 1.5], "texture": "#0"},
            				"west": {"uv": [6.75, 6.75, 7, 7.25], "texture": "#0"},
            				"up": {"uv": [4.75, 6.5, 3.25, 6.25], "texture": "#0"},
            				"down": {"uv": [7.75, 6, 6.25, 6.25], "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_righthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_lefthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"ground": {
            			"translation": [0, 2.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [0, -0.25, 0],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"fixed": {
            			"rotation": [0, 90, 0],
            			"translation": [0, 0, 1],
            			"scale": [0.6, 0.6, 0.6]
            		}
            	},
            	"groups": [
            		{
            			"name": "chair_shape",
            			"origin": [4.25, 5, 7.75],
            			"color": 0,
            			"children": [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
            		}
            	]
            }
            """;

    public static final String SIMPLE_CHAIR_RECLINED_CARPETED_TEMPLATE = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [32, 32],
            	"textures": {
            		"0": "aestheticseating:block/simple_chair_WOOD_NAME_VALUE",
            		"1": "aestheticseating:block/simple_chair_COLOR_NAME_VALUE",
            		"particle": "aestheticseating:block/simple_chair_WOOD_NAME_VALUE"
            	},
            	"elements": [
            		{
            			"name": "leg1",
            			"from": [3.5, 0, 3.5],
            			"to": [5, 7, 5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3.25, 0, 3.25]},
            			"faces": {
            				"north": {"uv": [2.5, 4.5, 3, 6.25], "texture": "#0"},
            				"east": {"uv": [3, 4.5, 3.5, 6.25], "texture": "#0"},
            				"south": {"uv": [3.5, 4.5, 4, 6.25], "texture": "#0"},
            				"west": {"uv": [4, 4.5, 4.5, 6.25], "texture": "#0"},
            				"up": {"uv": [6.75, 6.75, 6.25, 6.25], "texture": "#0"},
            				"down": {"uv": [3.75, 6.5, 3.25, 7], "texture": "#0"}
            			}
            		},
            		{
            			"name": "leg2",
            			"from": [3.5, 0, 11],
            			"to": [5, 7, 12.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3.25, 0, 10.75]},
            			"faces": {
            				"north": {"uv": [4.5, 4.5, 5, 6.25], "texture": "#0"},
            				"east": {"uv": [0, 5, 0.5, 6.75], "texture": "#0"},
            				"south": {"uv": [5, 0, 5.5, 1.75], "texture": "#0"},
            				"west": {"uv": [0.5, 5, 1, 6.75], "texture": "#0"},
            				"up": {"uv": [4.25, 7, 3.75, 6.5], "texture": "#0"},
            				"down": {"uv": [4.75, 6.5, 4.25, 7], "texture": "#0"}
            			}
            		},
            		{
            			"name": "leg3",
            			"from": [11, 0, 11],
            			"to": [12.5, 7, 12.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [10.75, 0, 10.75]},
            			"faces": {
            				"north": {"uv": [1, 5, 1.5, 6.75], "texture": "#0"},
            				"east": {"uv": [1.5, 5, 2, 6.75], "texture": "#0"},
            				"south": {"uv": [5, 1.75, 5.5, 3.5], "texture": "#0"},
            				"west": {"uv": [2, 5, 2.5, 6.75], "texture": "#0"},
            				"up": {"uv": [0.5, 7.25, 0, 6.75], "texture": "#0"},
            				"down": {"uv": [1, 6.75, 0.5, 7.25], "texture": "#0"}
            			}
            		},
            		{
            			"name": "leg4",
            			"from": [11, 0, 3.5],
            			"to": [12.5, 7, 5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [10.75, 0, 3.25]},
            			"faces": {
            				"north": {"uv": [5, 3.5, 5.5, 5.25], "texture": "#0"},
            				"east": {"uv": [5, 5.25, 5.5, 7], "texture": "#0"},
            				"south": {"uv": [5.5, 0, 6, 1.75], "texture": "#0"},
            				"west": {"uv": [5.5, 1.75, 6, 3.5], "texture": "#0"},
            				"up": {"uv": [1.5, 7.25, 1, 6.75], "texture": "#0"},
            				"down": {"uv": [2, 6.75, 1.5, 7.25], "texture": "#0"}
            			}
            		},
            		{
            			"name": "seat",
            			"from": [3.2, 7, 4],
            			"to": [12.8, 8, 13],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 7, 3]},
            			"faces": {
            				"north": {"uv": [6, 1.5, 8.5, 1.75], "texture": "#0"},
            				"east": {"uv": [6, 2.5, 8.25, 2.75], "texture": "#0"},
            				"south": {"uv": [6, 1.75, 8.5, 2], "texture": "#0"},
            				"west": {"uv": [6, 2.75, 8.25, 3], "texture": "#0"},
            				"up": {"uv": [5, 2.25, 2.5, 0], "texture": "#0"},
            				"down": {"uv": [5, 2.25, 2.5, 4.5], "texture": "#0"}
            			}
            		},
            		{
            			"name": "back",
            			"from": [3.25, 7, 2],
            			"to": [12.75, 17, 3],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 12, 2.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 2.5, 2.5], "texture": "#0"},
            				"east": {"uv": [5.5, 6, 5.75, 8.5], "texture": "#0"},
            				"south": {"uv": [0, 2.5, 2.5, 5], "texture": "#0"},
            				"west": {"uv": [5.75, 6, 6, 8.5], "texture": "#0"},
            				"up": {"uv": [8.5, 2.25, 6, 2], "texture": "#0"},
            				"down": {"uv": [8.5, 2.25, 6, 2.5], "texture": "#0"}
            			}
            		},
            		{
            			"name": "support1",
            			"from": [3.85, 5.25, 5],
            			"to": [4.65, 7, 11],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 5, 9]},
            			"faces": {
            				"north": {"uv": [4.75, 6.25, 5, 6.75], "texture": "#0"},
            				"east": {"uv": [5.5, 3.5, 7, 4], "texture": "#0"},
            				"south": {"uv": [2, 6.75, 2.25, 7.25], "texture": "#0"},
            				"west": {"uv": [5.5, 4, 7, 4.5], "texture": "#0"},
            				"up": {"uv": [6.25, 7.5, 6, 6], "texture": "#0"},
            				"down": {"uv": [2.75, 6.25, 2.5, 7.75], "texture": "#0"}
            			}
            		},
            		{
            			"name": "support2",
            			"from": [11.35, 5.25, 5],
            			"to": [12.15, 7, 11],
            			"rotation": {"angle": 0, "axis": "y", "origin": [10.5, 5, 9]},
            			"faces": {
            				"north": {"uv": [2.25, 6.75, 2.5, 7.25], "texture": "#0"},
            				"east": {"uv": [5.5, 4.5, 7, 5], "texture": "#0"},
            				"south": {"uv": [4.75, 6.75, 5, 7.25], "texture": "#0"},
            				"west": {"uv": [5.5, 5, 7, 5.5], "texture": "#0"},
            				"up": {"uv": [3, 7.75, 2.75, 6.25], "texture": "#0"},
            				"down": {"uv": [3.25, 6.25, 3, 7.75], "texture": "#0"}
            			}
            		},
            		{
            			"name": "support3",
            			"from": [5, 5.25, 11.35],
            			"to": [11, 7, 12.15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4.25, 5, 15.25]},
            			"faces": {
            				"north": {"uv": [5.5, 5.5, 7, 6], "texture": "#0"},
            				"east": {"uv": [6.25, 6.75, 6.5, 7.25], "texture": "#0"},
            				"south": {"uv": [6, 0, 7.5, 0.5], "texture": "#0"},
            				"west": {"uv": [6.75, 6.25, 7, 6.75], "texture": "#0"},
            				"up": {"uv": [7.5, 3.25, 6, 3], "texture": "#0"},
            				"down": {"uv": [7.5, 3.25, 6, 3.5], "texture": "#0"}
            			}
            		},
            		{
            			"name": "support4",
            			"from": [5, 5.25, 3.85],
            			"to": [11, 7, 4.65],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4.25, 5, 7.75]},
            			"faces": {
            				"north": {"uv": [6, 0.5, 7.5, 1], "texture": "#0"},
            				"east": {"uv": [6.5, 6.75, 6.75, 7.25], "texture": "#0"},
            				"south": {"uv": [6, 1, 7.5, 1.5], "texture": "#0"},
            				"west": {"uv": [6.75, 6.75, 7, 7.25], "texture": "#0"},
            				"up": {"uv": [4.75, 6.5, 3.25, 6.25], "texture": "#0"},
            				"down": {"uv": [7.75, 6, 6.25, 6.25], "texture": "#0"}
            			}
            		},
            		{
            			"from": [3.5, 8, 4.25],
            			"to": [12.5, 8.5, 12.75],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4, 8, 4.75]},
            			"faces": {
            				"north": {"uv": [4.5, 0, 9, 0.5], "texture": "#1"},
            				"east": {"uv": [4.5, 0.5, 9, 1], "texture": "#1"},
            				"south": {"uv": [4.5, 1, 9, 1.5], "texture": "#1"},
            				"west": {"uv": [4.5, 1.5, 9, 2], "texture": "#1"},
            				"up": {"uv": [4.5, 4.5, 0, 0], "texture": "#1"},
            				"down": {"uv": [4.5, 4.5, 0, 9], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_righthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_lefthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"ground": {
            			"translation": [0, 2.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [0, -0.25, 0],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"fixed": {
            			"rotation": [0, 90, 0],
            			"translation": [0, 0, 1],
            			"scale": [0.6, 0.6, 0.6]
            		}
            	},
            	"groups": [
            		{
            			"name": "chair_shape",
            			"origin": [4.25, 5, 7.75],
            			"color": 0,
            			"children": [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
            		},
            		{
            			"name": "carpet",
            			"origin": [8, 8, 8],
            			"color": 0,
            			"children": [10]
            		}
            	]
            }
            """;

    public static final String SIMPLE_CHAIR_BLOCKSTATE_TEMPLATE = """
            {
              "variants":
              {
                "facing=north,reclined=false,carpeted=false,carpet_color=black": { "model": "aestheticseating:block/black/simple_chair_WOOD_NAME_VALUE" },
                "facing=south,reclined=false,carpeted=false,carpet_color=black": { "model": "aestheticseating:block/black/simple_chair_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,reclined=false,carpeted=false,carpet_color=black": { "model": "aestheticseating:block/black/simple_chair_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,reclined=false,carpeted=false,carpet_color=black": { "model": "aestheticseating:block/black/simple_chair_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,reclined=true,carpeted=false,carpet_color=black": { "model": "aestheticseating:block/black/simple_chair_WOOD_NAME_VALUE_reclined" },
                "facing=south,reclined=true,carpeted=false,carpet_color=black": { "model": "aestheticseating:block/black/simple_chair_WOOD_NAME_VALUE_reclined", "y": 180 },
                "facing=west,reclined=true,carpeted=false,carpet_color=black": { "model": "aestheticseating:block/black/simple_chair_WOOD_NAME_VALUE_reclined", "y": 270 },
                "facing=east,reclined=true,carpeted=false,carpet_color=black": { "model": "aestheticseating:block/black/simple_chair_WOOD_NAME_VALUE_reclined", "y": 90 },
                "facing=north,reclined=false,carpeted=true,carpet_color=black": { "model": "aestheticseating:block/black/simple_chair_WOOD_NAME_VALUE_carpeted" },
                "facing=south,reclined=false,carpeted=true,carpet_color=black": { "model": "aestheticseating:block/black/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,reclined=false,carpeted=true,carpet_color=black": { "model": "aestheticseating:block/black/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,reclined=false,carpeted=true,carpet_color=black": { "model": "aestheticseating:block/black/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,reclined=true,carpeted=true,carpet_color=black": { "model": "aestheticseating:block/black/simple_chair_WOOD_NAME_VALUE_reclined_carpeted" },
                "facing=south,reclined=true,carpeted=true,carpet_color=black": { "model": "aestheticseating:block/black/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 180 },
                "facing=west,reclined=true,carpeted=true,carpet_color=black": { "model": "aestheticseating:block/black/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 270 },
                "facing=east,reclined=true,carpeted=true,carpet_color=black": { "model": "aestheticseating:block/black/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 90 },
            
                "facing=north,reclined=false,carpeted=false,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_chair_WOOD_NAME_VALUE" },
                "facing=south,reclined=false,carpeted=false,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_chair_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,reclined=false,carpeted=false,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_chair_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,reclined=false,carpeted=false,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_chair_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,reclined=true,carpeted=false,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_chair_WOOD_NAME_VALUE_reclined" },
                "facing=south,reclined=true,carpeted=false,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_chair_WOOD_NAME_VALUE_reclined", "y": 180 },
                "facing=west,reclined=true,carpeted=false,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_chair_WOOD_NAME_VALUE_reclined", "y": 270 },
                "facing=east,reclined=true,carpeted=false,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_chair_WOOD_NAME_VALUE_reclined", "y": 90 },
                "facing=north,reclined=false,carpeted=true,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_chair_WOOD_NAME_VALUE_carpeted" },
                "facing=south,reclined=false,carpeted=true,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,reclined=false,carpeted=true,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,reclined=false,carpeted=true,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,reclined=true,carpeted=true,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_chair_WOOD_NAME_VALUE_reclined_carpeted" },
                "facing=south,reclined=true,carpeted=true,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 180 },
                "facing=west,reclined=true,carpeted=true,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 270 },
                "facing=east,reclined=true,carpeted=true,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 90 },
            
                "facing=north,reclined=false,carpeted=false,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_chair_WOOD_NAME_VALUE" },
                "facing=south,reclined=false,carpeted=false,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_chair_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,reclined=false,carpeted=false,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_chair_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,reclined=false,carpeted=false,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_chair_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,reclined=true,carpeted=false,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_chair_WOOD_NAME_VALUE_reclined" },
                "facing=south,reclined=true,carpeted=false,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_chair_WOOD_NAME_VALUE_reclined", "y": 180 },
                "facing=west,reclined=true,carpeted=false,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_chair_WOOD_NAME_VALUE_reclined", "y": 270 },
                "facing=east,reclined=true,carpeted=false,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_chair_WOOD_NAME_VALUE_reclined", "y": 90 },
                "facing=north,reclined=false,carpeted=true,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_chair_WOOD_NAME_VALUE_carpeted" },
                "facing=south,reclined=false,carpeted=true,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,reclined=false,carpeted=true,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,reclined=false,carpeted=true,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,reclined=true,carpeted=true,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_chair_WOOD_NAME_VALUE_reclined_carpeted" },
                "facing=south,reclined=true,carpeted=true,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 180 },
                "facing=west,reclined=true,carpeted=true,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 270 },
                "facing=east,reclined=true,carpeted=true,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 90 },
            
                "facing=north,reclined=false,carpeted=false,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_chair_WOOD_NAME_VALUE" },
                "facing=south,reclined=false,carpeted=false,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_chair_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,reclined=false,carpeted=false,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_chair_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,reclined=false,carpeted=false,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_chair_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,reclined=true,carpeted=false,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_chair_WOOD_NAME_VALUE_reclined" },
                "facing=south,reclined=true,carpeted=false,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_chair_WOOD_NAME_VALUE_reclined", "y": 180 },
                "facing=west,reclined=true,carpeted=false,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_chair_WOOD_NAME_VALUE_reclined", "y": 270 },
                "facing=east,reclined=true,carpeted=false,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_chair_WOOD_NAME_VALUE_reclined", "y": 90 },
                "facing=north,reclined=false,carpeted=true,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_chair_WOOD_NAME_VALUE_carpeted" },
                "facing=south,reclined=false,carpeted=true,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,reclined=false,carpeted=true,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,reclined=false,carpeted=true,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,reclined=true,carpeted=true,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_chair_WOOD_NAME_VALUE_reclined_carpeted" },
                "facing=south,reclined=true,carpeted=true,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 180 },
                "facing=west,reclined=true,carpeted=true,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 270 },
                "facing=east,reclined=true,carpeted=true,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 90 },
            
                "facing=north,reclined=false,carpeted=false,carpet_color=white": { "model": "aestheticseating:block/white/simple_chair_WOOD_NAME_VALUE" },
                "facing=south,reclined=false,carpeted=false,carpet_color=white": { "model": "aestheticseating:block/white/simple_chair_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,reclined=false,carpeted=false,carpet_color=white": { "model": "aestheticseating:block/white/simple_chair_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,reclined=false,carpeted=false,carpet_color=white": { "model": "aestheticseating:block/white/simple_chair_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,reclined=true,carpeted=false,carpet_color=white": { "model": "aestheticseating:block/white/simple_chair_WOOD_NAME_VALUE_reclined" },
                "facing=south,reclined=true,carpeted=false,carpet_color=white": { "model": "aestheticseating:block/white/simple_chair_WOOD_NAME_VALUE_reclined", "y": 180 },
                "facing=west,reclined=true,carpeted=false,carpet_color=white": { "model": "aestheticseating:block/white/simple_chair_WOOD_NAME_VALUE_reclined", "y": 270 },
                "facing=east,reclined=true,carpeted=false,carpet_color=white": { "model": "aestheticseating:block/white/simple_chair_WOOD_NAME_VALUE_reclined", "y": 90 },
                "facing=north,reclined=false,carpeted=true,carpet_color=white": { "model": "aestheticseating:block/white/simple_chair_WOOD_NAME_VALUE_carpeted" },
                "facing=south,reclined=false,carpeted=true,carpet_color=white": { "model": "aestheticseating:block/white/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,reclined=false,carpeted=true,carpet_color=white": { "model": "aestheticseating:block/white/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,reclined=false,carpeted=true,carpet_color=white": { "model": "aestheticseating:block/white/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,reclined=true,carpeted=true,carpet_color=white": { "model": "aestheticseating:block/white/simple_chair_WOOD_NAME_VALUE_reclined_carpeted" },
                "facing=south,reclined=true,carpeted=true,carpet_color=white": { "model": "aestheticseating:block/white/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 180 },
                "facing=west,reclined=true,carpeted=true,carpet_color=white": { "model": "aestheticseating:block/white/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 270 },
                "facing=east,reclined=true,carpeted=true,carpet_color=white": { "model": "aestheticseating:block/white/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 90 },
            
                "facing=north,reclined=false,carpeted=false,carpet_color=red": { "model": "aestheticseating:block/red/simple_chair_WOOD_NAME_VALUE" },
                "facing=south,reclined=false,carpeted=false,carpet_color=red": { "model": "aestheticseating:block/red/simple_chair_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,reclined=false,carpeted=false,carpet_color=red": { "model": "aestheticseating:block/red/simple_chair_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,reclined=false,carpeted=false,carpet_color=red": { "model": "aestheticseating:block/red/simple_chair_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,reclined=true,carpeted=false,carpet_color=red": { "model": "aestheticseating:block/red/simple_chair_WOOD_NAME_VALUE_reclined" },
                "facing=south,reclined=true,carpeted=false,carpet_color=red": { "model": "aestheticseating:block/red/simple_chair_WOOD_NAME_VALUE_reclined", "y": 180 },
                "facing=west,reclined=true,carpeted=false,carpet_color=red": { "model": "aestheticseating:block/red/simple_chair_WOOD_NAME_VALUE_reclined", "y": 270 },
                "facing=east,reclined=true,carpeted=false,carpet_color=red": { "model": "aestheticseating:block/red/simple_chair_WOOD_NAME_VALUE_reclined", "y": 90 },
                "facing=north,reclined=false,carpeted=true,carpet_color=red": { "model": "aestheticseating:block/red/simple_chair_WOOD_NAME_VALUE_carpeted" },
                "facing=south,reclined=false,carpeted=true,carpet_color=red": { "model": "aestheticseating:block/red/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,reclined=false,carpeted=true,carpet_color=red": { "model": "aestheticseating:block/red/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,reclined=false,carpeted=true,carpet_color=red": { "model": "aestheticseating:block/red/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,reclined=true,carpeted=true,carpet_color=red": { "model": "aestheticseating:block/red/simple_chair_WOOD_NAME_VALUE_reclined_carpeted" },
                "facing=south,reclined=true,carpeted=true,carpet_color=red": { "model": "aestheticseating:block/red/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 180 },
                "facing=west,reclined=true,carpeted=true,carpet_color=red": { "model": "aestheticseating:block/red/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 270 },
                "facing=east,reclined=true,carpeted=true,carpet_color=red": { "model": "aestheticseating:block/red/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 90 },
            
                "facing=north,reclined=false,carpeted=false,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_chair_WOOD_NAME_VALUE" },
                "facing=south,reclined=false,carpeted=false,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_chair_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,reclined=false,carpeted=false,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_chair_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,reclined=false,carpeted=false,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_chair_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,reclined=true,carpeted=false,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_chair_WOOD_NAME_VALUE_reclined" },
                "facing=south,reclined=true,carpeted=false,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_chair_WOOD_NAME_VALUE_reclined", "y": 180 },
                "facing=west,reclined=true,carpeted=false,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_chair_WOOD_NAME_VALUE_reclined", "y": 270 },
                "facing=east,reclined=true,carpeted=false,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_chair_WOOD_NAME_VALUE_reclined", "y": 90 },
                "facing=north,reclined=false,carpeted=true,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_chair_WOOD_NAME_VALUE_carpeted" },
                "facing=south,reclined=false,carpeted=true,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,reclined=false,carpeted=true,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,reclined=false,carpeted=true,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,reclined=true,carpeted=true,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_chair_WOOD_NAME_VALUE_reclined_carpeted" },
                "facing=south,reclined=true,carpeted=true,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 180 },
                "facing=west,reclined=true,carpeted=true,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 270 },
                "facing=east,reclined=true,carpeted=true,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 90 },
            
                "facing=north,reclined=false,carpeted=false,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_chair_WOOD_NAME_VALUE" },
                "facing=south,reclined=false,carpeted=false,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_chair_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,reclined=false,carpeted=false,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_chair_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,reclined=false,carpeted=false,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_chair_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,reclined=true,carpeted=false,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_chair_WOOD_NAME_VALUE_reclined" },
                "facing=south,reclined=true,carpeted=false,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_chair_WOOD_NAME_VALUE_reclined", "y": 180 },
                "facing=west,reclined=true,carpeted=false,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_chair_WOOD_NAME_VALUE_reclined", "y": 270 },
                "facing=east,reclined=true,carpeted=false,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_chair_WOOD_NAME_VALUE_reclined", "y": 90 },
                "facing=north,reclined=false,carpeted=true,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_chair_WOOD_NAME_VALUE_carpeted" },
                "facing=south,reclined=false,carpeted=true,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,reclined=false,carpeted=true,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,reclined=false,carpeted=true,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,reclined=true,carpeted=true,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_chair_WOOD_NAME_VALUE_reclined_carpeted" },
                "facing=south,reclined=true,carpeted=true,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 180 },
                "facing=west,reclined=true,carpeted=true,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 270 },
                "facing=east,reclined=true,carpeted=true,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 90 },
            
                "facing=north,reclined=false,carpeted=false,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_chair_WOOD_NAME_VALUE" },
                "facing=south,reclined=false,carpeted=false,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_chair_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,reclined=false,carpeted=false,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_chair_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,reclined=false,carpeted=false,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_chair_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,reclined=true,carpeted=false,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_chair_WOOD_NAME_VALUE_reclined" },
                "facing=south,reclined=true,carpeted=false,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_chair_WOOD_NAME_VALUE_reclined", "y": 180 },
                "facing=west,reclined=true,carpeted=false,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_chair_WOOD_NAME_VALUE_reclined", "y": 270 },
                "facing=east,reclined=true,carpeted=false,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_chair_WOOD_NAME_VALUE_reclined", "y": 90 },
                "facing=north,reclined=false,carpeted=true,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_chair_WOOD_NAME_VALUE_carpeted" },
                "facing=south,reclined=false,carpeted=true,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,reclined=false,carpeted=true,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,reclined=false,carpeted=true,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,reclined=true,carpeted=true,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_chair_WOOD_NAME_VALUE_reclined_carpeted" },
                "facing=south,reclined=true,carpeted=true,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 180 },
                "facing=west,reclined=true,carpeted=true,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 270 },
                "facing=east,reclined=true,carpeted=true,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 90 },
            
                "facing=north,reclined=false,carpeted=false,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_chair_WOOD_NAME_VALUE" },
                "facing=south,reclined=false,carpeted=false,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_chair_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,reclined=false,carpeted=false,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_chair_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,reclined=false,carpeted=false,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_chair_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,reclined=true,carpeted=false,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_chair_WOOD_NAME_VALUE_reclined" },
                "facing=south,reclined=true,carpeted=false,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_chair_WOOD_NAME_VALUE_reclined", "y": 180 },
                "facing=west,reclined=true,carpeted=false,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_chair_WOOD_NAME_VALUE_reclined", "y": 270 },
                "facing=east,reclined=true,carpeted=false,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_chair_WOOD_NAME_VALUE_reclined", "y": 90 },
                "facing=north,reclined=false,carpeted=true,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_chair_WOOD_NAME_VALUE_carpeted" },
                "facing=south,reclined=false,carpeted=true,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,reclined=false,carpeted=true,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,reclined=false,carpeted=true,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,reclined=true,carpeted=true,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_chair_WOOD_NAME_VALUE_reclined_carpeted" },
                "facing=south,reclined=true,carpeted=true,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 180 },
                "facing=west,reclined=true,carpeted=true,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 270 },
                "facing=east,reclined=true,carpeted=true,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 90 },
            
                "facing=north,reclined=false,carpeted=false,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_chair_WOOD_NAME_VALUE" },
                "facing=south,reclined=false,carpeted=false,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_chair_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,reclined=false,carpeted=false,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_chair_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,reclined=false,carpeted=false,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_chair_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,reclined=true,carpeted=false,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_chair_WOOD_NAME_VALUE_reclined" },
                "facing=south,reclined=true,carpeted=false,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_chair_WOOD_NAME_VALUE_reclined", "y": 180 },
                "facing=west,reclined=true,carpeted=false,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_chair_WOOD_NAME_VALUE_reclined", "y": 270 },
                "facing=east,reclined=true,carpeted=false,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_chair_WOOD_NAME_VALUE_reclined", "y": 90 },
                "facing=north,reclined=false,carpeted=true,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_chair_WOOD_NAME_VALUE_carpeted" },
                "facing=south,reclined=false,carpeted=true,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,reclined=false,carpeted=true,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,reclined=false,carpeted=true,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,reclined=true,carpeted=true,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_chair_WOOD_NAME_VALUE_reclined_carpeted" },
                "facing=south,reclined=true,carpeted=true,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 180 },
                "facing=west,reclined=true,carpeted=true,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 270 },
                "facing=east,reclined=true,carpeted=true,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 90 },
            
                "facing=north,reclined=false,carpeted=false,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_chair_WOOD_NAME_VALUE" },
                "facing=south,reclined=false,carpeted=false,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_chair_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,reclined=false,carpeted=false,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_chair_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,reclined=false,carpeted=false,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_chair_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,reclined=true,carpeted=false,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_chair_WOOD_NAME_VALUE_reclined" },
                "facing=south,reclined=true,carpeted=false,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_chair_WOOD_NAME_VALUE_reclined", "y": 180 },
                "facing=west,reclined=true,carpeted=false,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_chair_WOOD_NAME_VALUE_reclined", "y": 270 },
                "facing=east,reclined=true,carpeted=false,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_chair_WOOD_NAME_VALUE_reclined", "y": 90 },
                "facing=north,reclined=false,carpeted=true,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_chair_WOOD_NAME_VALUE_carpeted" },
                "facing=south,reclined=false,carpeted=true,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,reclined=false,carpeted=true,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,reclined=false,carpeted=true,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,reclined=true,carpeted=true,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_chair_WOOD_NAME_VALUE_reclined_carpeted" },
                "facing=south,reclined=true,carpeted=true,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 180 },
                "facing=west,reclined=true,carpeted=true,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 270 },
                "facing=east,reclined=true,carpeted=true,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 90 },
            
                "facing=north,reclined=false,carpeted=false,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_chair_WOOD_NAME_VALUE" },
                "facing=south,reclined=false,carpeted=false,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_chair_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,reclined=false,carpeted=false,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_chair_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,reclined=false,carpeted=false,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_chair_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,reclined=true,carpeted=false,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_chair_WOOD_NAME_VALUE_reclined" },
                "facing=south,reclined=true,carpeted=false,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_chair_WOOD_NAME_VALUE_reclined", "y": 180 },
                "facing=west,reclined=true,carpeted=false,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_chair_WOOD_NAME_VALUE_reclined", "y": 270 },
                "facing=east,reclined=true,carpeted=false,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_chair_WOOD_NAME_VALUE_reclined", "y": 90 },
                "facing=north,reclined=false,carpeted=true,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_chair_WOOD_NAME_VALUE_carpeted" },
                "facing=south,reclined=false,carpeted=true,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,reclined=false,carpeted=true,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,reclined=false,carpeted=true,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,reclined=true,carpeted=true,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_chair_WOOD_NAME_VALUE_reclined_carpeted" },
                "facing=south,reclined=true,carpeted=true,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 180 },
                "facing=west,reclined=true,carpeted=true,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 270 },
                "facing=east,reclined=true,carpeted=true,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 90 },
            
                "facing=north,reclined=false,carpeted=false,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_chair_WOOD_NAME_VALUE" },
                "facing=south,reclined=false,carpeted=false,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_chair_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,reclined=false,carpeted=false,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_chair_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,reclined=false,carpeted=false,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_chair_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,reclined=true,carpeted=false,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_chair_WOOD_NAME_VALUE_reclined" },
                "facing=south,reclined=true,carpeted=false,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_chair_WOOD_NAME_VALUE_reclined", "y": 180 },
                "facing=west,reclined=true,carpeted=false,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_chair_WOOD_NAME_VALUE_reclined", "y": 270 },
                "facing=east,reclined=true,carpeted=false,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_chair_WOOD_NAME_VALUE_reclined", "y": 90 },
                "facing=north,reclined=false,carpeted=true,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_chair_WOOD_NAME_VALUE_carpeted" },
                "facing=south,reclined=false,carpeted=true,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,reclined=false,carpeted=true,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,reclined=false,carpeted=true,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,reclined=true,carpeted=true,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_chair_WOOD_NAME_VALUE_reclined_carpeted" },
                "facing=south,reclined=true,carpeted=true,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 180 },
                "facing=west,reclined=true,carpeted=true,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 270 },
                "facing=east,reclined=true,carpeted=true,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 90 },
            
                "facing=north,reclined=false,carpeted=false,carpet_color=green": { "model": "aestheticseating:block/green/simple_chair_WOOD_NAME_VALUE" },
                "facing=south,reclined=false,carpeted=false,carpet_color=green": { "model": "aestheticseating:block/green/simple_chair_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,reclined=false,carpeted=false,carpet_color=green": { "model": "aestheticseating:block/green/simple_chair_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,reclined=false,carpeted=false,carpet_color=green": { "model": "aestheticseating:block/green/simple_chair_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,reclined=true,carpeted=false,carpet_color=green": { "model": "aestheticseating:block/green/simple_chair_WOOD_NAME_VALUE_reclined" },
                "facing=south,reclined=true,carpeted=false,carpet_color=green": { "model": "aestheticseating:block/green/simple_chair_WOOD_NAME_VALUE_reclined", "y": 180 },
                "facing=west,reclined=true,carpeted=false,carpet_color=green": { "model": "aestheticseating:block/green/simple_chair_WOOD_NAME_VALUE_reclined", "y": 270 },
                "facing=east,reclined=true,carpeted=false,carpet_color=green": { "model": "aestheticseating:block/green/simple_chair_WOOD_NAME_VALUE_reclined", "y": 90 },
                "facing=north,reclined=false,carpeted=true,carpet_color=green": { "model": "aestheticseating:block/green/simple_chair_WOOD_NAME_VALUE_carpeted" },
                "facing=south,reclined=false,carpeted=true,carpet_color=green": { "model": "aestheticseating:block/green/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,reclined=false,carpeted=true,carpet_color=green": { "model": "aestheticseating:block/green/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,reclined=false,carpeted=true,carpet_color=green": { "model": "aestheticseating:block/green/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,reclined=true,carpeted=true,carpet_color=green": { "model": "aestheticseating:block/green/simple_chair_WOOD_NAME_VALUE_reclined_carpeted" },
                "facing=south,reclined=true,carpeted=true,carpet_color=green": { "model": "aestheticseating:block/green/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 180 },
                "facing=west,reclined=true,carpeted=true,carpet_color=green": { "model": "aestheticseating:block/green/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 270 },
                "facing=east,reclined=true,carpeted=true,carpet_color=green": { "model": "aestheticseating:block/green/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 90 },
            
                "facing=north,reclined=false,carpeted=false,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_chair_WOOD_NAME_VALUE" },
                "facing=south,reclined=false,carpeted=false,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_chair_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,reclined=false,carpeted=false,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_chair_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,reclined=false,carpeted=false,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_chair_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,reclined=true,carpeted=false,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_chair_WOOD_NAME_VALUE_reclined" },
                "facing=south,reclined=true,carpeted=false,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_chair_WOOD_NAME_VALUE_reclined", "y": 180 },
                "facing=west,reclined=true,carpeted=false,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_chair_WOOD_NAME_VALUE_reclined", "y": 270 },
                "facing=east,reclined=true,carpeted=false,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_chair_WOOD_NAME_VALUE_reclined", "y": 90 },
                "facing=north,reclined=false,carpeted=true,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_chair_WOOD_NAME_VALUE_carpeted" },
                "facing=south,reclined=false,carpeted=true,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,reclined=false,carpeted=true,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,reclined=false,carpeted=true,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_chair_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,reclined=true,carpeted=true,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_chair_WOOD_NAME_VALUE_reclined_carpeted" },
                "facing=south,reclined=true,carpeted=true,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 180 },
                "facing=west,reclined=true,carpeted=true,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 270 },
                "facing=east,reclined=true,carpeted=true,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_chair_WOOD_NAME_VALUE_reclined_carpeted", "y": 90 }
              }
            }
            """;

    public static final String SIMPLE_BENCH_BLOCKSTATE_TEMPLATE = """
            {
              "variants":
              {
                "facing=north,variant=normal,backrest=false": { "model": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE" },
                "facing=south,variant=normal,backrest=false": { "model": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,variant=normal,backrest=false": { "model": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,variant=normal,backrest=false": { "model": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE", "y": 90 },
            
                "facing=north,variant=center,backrest=false": { "model": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE_center" },
                "facing=south,variant=center,backrest=false": { "model": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE_center", "y": 180 },
                "facing=west,variant=center,backrest=false": { "model": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE_center", "y": 270 },
                "facing=east,variant=center,backrest=false": { "model": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE_center", "y": 90 },
            
                "facing=north,variant=left,backrest=false": { "model": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE_left" },
                "facing=south,variant=left,backrest=false": { "model": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE_left", "y": 180 },
                "facing=west,variant=left,backrest=false": { "model": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE_left", "y": 270 },
                "facing=east,variant=left,backrest=false": { "model": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE_left", "y": 90 },
            
                "facing=north,variant=right,backrest=false": { "model": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE_right" },
                "facing=south,variant=right,backrest=false": { "model": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE_right", "y": 180 },
                "facing=west,variant=right,backrest=false": { "model": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE_right", "y": 270 },
                "facing=east,variant=right,backrest=false": { "model": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE_right", "y": 90 },
            
                "facing=north,variant=normal,backrest=true": { "model": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE_backrest" },
                "facing=south,variant=normal,backrest=true": { "model": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE_backrest", "y": 180 },
                "facing=west,variant=normal,backrest=true": { "model": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE_backrest", "y": 270 },
                "facing=east,variant=normal,backrest=true": { "model": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE_backrest", "y": 90 },
            
                "facing=north,variant=center,backrest=true": { "model": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE_center_backrest" },
                "facing=south,variant=center,backrest=true": { "model": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE_center_backrest", "y": 180 },
                "facing=west,variant=center,backrest=true": { "model": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE_center_backrest", "y": 270 },
                "facing=east,variant=center,backrest=true": { "model": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE_center_backrest", "y": 90 },
            
                "facing=north,variant=left,backrest=true": { "model": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE_left_backrest" },
                "facing=south,variant=left,backrest=true": { "model": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE_left_backrest", "y": 180 },
                "facing=west,variant=left,backrest=true": { "model": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE_left_backrest", "y": 270 },
                "facing=east,variant=left,backrest=true": { "model": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE_left_backrest", "y": 90 },
            
                "facing=north,variant=right,backrest=true": { "model": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE_right_backrest" },
                "facing=south,variant=right,backrest=true": { "model": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE_right_backrest", "y": 180 },
                "facing=west,variant=right,backrest=true": { "model": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE_right_backrest", "y": 270 },
                "facing=east,variant=right,backrest=true": { "model": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE_right_backrest", "y": 90 }
              }
            }
            """;

    public static final String STONE_BENCH_BLOCKSTATE_TEMPLATE = """
            {
              "variants":
              {
                "facing=north,variant=normal": { "model": "aestheticseating:block/stone_bench_STONE_NAME_VALUE" },
                "facing=south,variant=normal": { "model": "aestheticseating:block/stone_bench_STONE_NAME_VALUE", "y": 180 },
                "facing=west,variant=normal": { "model": "aestheticseating:block/stone_bench_STONE_NAME_VALUE", "y": 270 },
                "facing=east,variant=normal": { "model": "aestheticseating:block/stone_bench_STONE_NAME_VALUE", "y": 90 },
            
                "facing=north,variant=center": { "model": "aestheticseating:block/stone_bench_STONE_NAME_VALUE_center" },
                "facing=south,variant=center": { "model": "aestheticseating:block/stone_bench_STONE_NAME_VALUE_center", "y": 180 },
                "facing=west,variant=center": { "model": "aestheticseating:block/stone_bench_STONE_NAME_VALUE_center", "y": 270 },
                "facing=east,variant=center": { "model": "aestheticseating:block/stone_bench_STONE_NAME_VALUE_center", "y": 90 },
            
                "facing=north,variant=left": { "model": "aestheticseating:block/stone_bench_STONE_NAME_VALUE_left" },
                "facing=south,variant=left": { "model": "aestheticseating:block/stone_bench_STONE_NAME_VALUE_left", "y": 180 },
                "facing=west,variant=left": { "model": "aestheticseating:block/stone_bench_STONE_NAME_VALUE_left", "y": 270 },
                "facing=east,variant=left": { "model": "aestheticseating:block/stone_bench_STONE_NAME_VALUE_left", "y": 90 },
            
                "facing=north,variant=right": { "model": "aestheticseating:block/stone_bench_STONE_NAME_VALUE_right" },
                "facing=south,variant=right": { "model": "aestheticseating:block/stone_bench_STONE_NAME_VALUE_right", "y": 180 },
                "facing=west,variant=right": { "model": "aestheticseating:block/stone_bench_STONE_NAME_VALUE_right", "y": 270 },
                "facing=east,variant=right": { "model": "aestheticseating:block/stone_bench_STONE_NAME_VALUE_right", "y": 90 }
              }
            }
            """;

    public static final String SOFA_BLOCKSTATE_TEMPLATE = """
            {
              "variants":
              {
                "facing=north,variant=normal,cushion=false": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE" },
                "facing=south,variant=normal,cushion=false": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE", "y": 180 },
                "facing=west,variant=normal,cushion=false": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE", "y": 270 },
                "facing=east,variant=normal,cushion=false": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE", "y": 90 },
            
                "facing=north,variant=center,cushion=false": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_center" },
                "facing=south,variant=center,cushion=false": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_center", "y": 180 },
                "facing=west,variant=center,cushion=false": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_center", "y": 270 },
                "facing=east,variant=center,cushion=false": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_center", "y": 90 },
            
                "facing=north,variant=left,cushion=false": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_left" },
                "facing=south,variant=left,cushion=false": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_left", "y": 180 },
                "facing=west,variant=left,cushion=false": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_left", "y": 270 },
                "facing=east,variant=left,cushion=false": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_left", "y": 90 },
            
                "facing=north,variant=right,cushion=false": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_right" },
                "facing=south,variant=right,cushion=false": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_right", "y": 180 },
                "facing=west,variant=right,cushion=false": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_right", "y": 270 },
                "facing=east,variant=right,cushion=false": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_right", "y": 90 },
            
                "facing=north,variant=leftcorner,cushion=false": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_leftcorner" },
                "facing=south,variant=leftcorner,cushion=false": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_leftcorner", "y": 180 },
                "facing=west,variant=leftcorner,cushion=false": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_leftcorner", "y": 270 },
                "facing=east,variant=leftcorner,cushion=false": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_leftcorner", "y": 90 },
            
                "facing=north,variant=rightcorner,cushion=false": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_rightcorner" },
                "facing=south,variant=rightcorner,cushion=false": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_rightcorner", "y": 180 },
                "facing=west,variant=rightcorner,cushion=false": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_rightcorner", "y": 270 },
                "facing=east,variant=rightcorner,cushion=false": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_rightcorner", "y": 90 },
            
                "facing=north,variant=normal,cushion=true": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_cushion" },
                "facing=south,variant=normal,cushion=true": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_cushion", "y": 180 },
                "facing=west,variant=normal,cushion=true": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_cushion", "y": 270 },
                "facing=east,variant=normal,cushion=true": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_cushion", "y": 90 },
            
                "facing=north,variant=center,cushion=true": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_center_cushion" },
                "facing=south,variant=center,cushion=true": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_center_cushion", "y": 180 },
                "facing=west,variant=center,cushion=true": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_center_cushion", "y": 270 },
                "facing=east,variant=center,cushion=true": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_center_cushion", "y": 90 },
            
                "facing=north,variant=left,cushion=true": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_left_cushion" },
                "facing=south,variant=left,cushion=true": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_left_cushion", "y": 180 },
                "facing=west,variant=left,cushion=true": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_left_cushion", "y": 270 },
                "facing=east,variant=left,cushion=true": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_left_cushion", "y": 90 },
            
                "facing=north,variant=right,cushion=true": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_right_cushion" },
                "facing=south,variant=right,cushion=true": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_right_cushion", "y": 180 },
                "facing=west,variant=right,cushion=true": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_right_cushion", "y": 270 },
                "facing=east,variant=right,cushion=true": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_right_cushion", "y": 90 },
            
                "facing=north,variant=leftcorner,cushion=true": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_leftcorner_cushion" },
                "facing=south,variant=leftcorner,cushion=true": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_leftcorner_cushion", "y": 180 },
                "facing=west,variant=leftcorner,cushion=true": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_leftcorner_cushion", "y": 270 },
                "facing=east,variant=leftcorner,cushion=true": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_leftcorner_cushion", "y": 90 },
            
                "facing=north,variant=rightcorner,cushion=true": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_rightcorner_cushion" },
                "facing=south,variant=rightcorner,cushion=true": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_rightcorner_cushion", "y": 180 },
                "facing=west,variant=rightcorner,cushion=true": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_rightcorner_cushion", "y": 270 },
                "facing=east,variant=rightcorner,cushion=true": { "model": "aestheticseating:block/sofa_COLOR_NAME_VALUE_rightcorner_cushion", "y": 90 }
              }
            }
            """;

    public static final String SETTEE_0_MODEL_TEMPLATE = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [64, 64],
            	"textures": {
            		"0": "aestheticseating:block/settee_COLOR_NAME_VALUE",
            		"particle": "aestheticseating:block/settee_COLOR_NAME_VALUE"
            	},
            	"elements": [
            		{
            			"from": [-4, 0, 0],
            			"to": [20, 4, 14],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 2, 7]},
            			"faces": {
            				"north": {"uv": [6, 4, 12, 5], "texture": "#0"},
            				"east": {"uv": [4, 7.25, 7.5, 8.25], "texture": "#0"},
            				"south": {"uv": [6, 5, 12, 6], "texture": "#0"},
            				"west": {"uv": [7.5, 7.25, 11, 8.25], "texture": "#0"},
            				"up": {"uv": [6, 3.5, 0, 0], "texture": "#0"},
            				"down": {"uv": [6, 3.5, 0, 7], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 2.48254, -0.34462],
            			"to": [16, 10.48254, 4.65538],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 6.48254, 2.15538]},
            			"faces": {
            				"north": {"uv": [6, 0, 10, 2], "texture": "#0"},
            				"east": {"uv": [5.5, 9.25, 6.75, 11.25], "texture": "#0"},
            				"south": {"uv": [6, 2, 10, 4], "texture": "#0"},
            				"west": {"uv": [9, 9.25, 10.25, 11.25], "texture": "#0"},
            				"up": {"uv": [10, 7.25, 6, 6], "texture": "#0"},
            				"down": {"uv": [4, 7, 0, 8.25], "texture": "#0"}
            			}
            		},
            		{
            			"from": [-4, 4.5, 0],
            			"to": [0, 8.5, 14],
            			"rotation": {"angle": 0, "axis": "y", "origin": [-2, 6.5, 7]},
            			"faces": {
            				"north": {"uv": [10, 3, 11, 4], "texture": "#0"},
            				"east": {"uv": [0, 8.25, 3.5, 9.25], "texture": "#0"},
            				"south": {"uv": [10, 6, 11, 7], "texture": "#0"},
            				"west": {"uv": [3.5, 8.25, 7, 9.25], "texture": "#0"},
            				"up": {"uv": [8, 11.75, 7, 8.25], "texture": "#0"},
            				"down": {"uv": [9, 8.25, 8, 11.75], "texture": "#0"}
            			}
            		},
            		{
            			"from": [-3, 4, 2],
            			"to": [-1, 4.5, 12],
            			"rotation": {"angle": 0, "axis": "y", "origin": [-2, 4.25, 7]},
            			"faces": {
            				"north": {"uv": [10, 3, 11, 4], "texture": "#0"},
            				"east": {"uv": [0, 8.25, 3.5, 9.25], "texture": "#0"},
            				"south": {"uv": [10, 6, 11, 7], "texture": "#0"},
            				"west": {"uv": [3.5, 8.25, 7, 9.25], "texture": "#0"},
            				"up": {"uv": [8, 11.75, 7, 8.25], "texture": "#0"},
            				"down": {"uv": [9, 8.25, 8, 11.75], "texture": "#0"}
            			}
            		},
            		{
            			"from": [17, 4, 2],
            			"to": [19, 4.5, 12],
            			"rotation": {"angle": 0, "axis": "y", "origin": [18, 4.25, 7]},
            			"faces": {
            				"north": {"uv": [10, 3, 11, 4], "texture": "#0"},
            				"east": {"uv": [0, 8.25, 3.5, 9.25], "texture": "#0"},
            				"south": {"uv": [10, 6, 11, 7], "texture": "#0"},
            				"west": {"uv": [3.5, 8.25, 7, 9.25], "texture": "#0"},
            				"up": {"uv": [8, 11.75, 7, 8.25], "texture": "#0"},
            				"down": {"uv": [9, 8.25, 8, 11.75], "texture": "#0"}
            			}
            		},
            		{
            			"from": [16, 4.5, 0],
            			"to": [20, 8.5, 14],
            			"rotation": {"angle": 0, "axis": "y", "origin": [18, 6.5, 7]},
            			"faces": {
            				"north": {"uv": [10.25, 9.25, 11.25, 10.25], "texture": "#0"},
            				"east": {"uv": [9, 8.25, 12.5, 9.25], "texture": "#0"},
            				"south": {"uv": [10.25, 10.25, 11.25, 11.25], "texture": "#0"},
            				"west": {"uv": [0, 9.25, 3.5, 10.25], "texture": "#0"},
            				"up": {"uv": [4.5, 12.75, 3.5, 9.25], "texture": "#0"},
            				"down": {"uv": [5.5, 9.25, 4.5, 12.75], "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"rotation": [45, 0, 0],
            			"translation": [-6, 4, 2],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"thirdperson_lefthand": {
            			"rotation": [45, 0, 0],
            			"translation": [-6, 4, 2],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_righthand": {
            			"rotation": [45, 0, 0],
            			"translation": [2.25, 1.5, 2],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_lefthand": {
            			"rotation": [45, 0, 0],
            			"translation": [2.25, 1.5, 2],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.4, 0.4, 0.4]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [-0.25, 1, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [-180, 0, -180],
            			"translation": [0, 0, -1],
            			"scale": [0.4, 0.4, 0.4]
            		}
            	},
            	"groups": [
            		{
            			"name": "settee",
            			"origin": [8, 8, 8],
            			"color": 0,
            			"children": [0, 1, 2, 3, 4, 5]
            		}
            	]
            }
            """;

    public static final String SETTEE_TRANSFORMED_0_MODEL_TEMPLATE = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [64, 64],
            	"textures": {
            		"0": "aestheticseating:block/settee_COLOR_NAME_VALUE",
            		"particle": "aestheticseating:block/settee_COLOR_NAME_VALUE"
            	},
            	"elements": [
            		{
            			"from": [-4, 0, 0],
            			"to": [20, 4, 14],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 2, 7]},
            			"faces": {
            				"north": {"uv": [6, 4, 12, 5], "texture": "#0"},
            				"east": {"uv": [4, 7.25, 7.5, 8.25], "texture": "#0"},
            				"south": {"uv": [6, 5, 12, 6], "texture": "#0"},
            				"west": {"uv": [7.5, 7.25, 11, 8.25], "texture": "#0"},
            				"up": {"uv": [6, 3.5, 0, 0], "texture": "#0"},
            				"down": {"uv": [6, 3.5, 0, 7], "texture": "#0"}
            			}
            		},
            		{
            			"from": [-4, 1.98254, 0.15538],
            			"to": [4, 6.98254, 16.15538],
            			"rotation": {"angle": -45, "axis": "z", "origin": [0, 4.48254, 8.15538]},
            			"faces": {
            				"north": {"uv": [9, 9.25, 10.25, 11.25], "rotation": 270, "texture": "#0"},
            				"east": {"uv": [10, 7.25, 6, 6], "rotation": 180, "texture": "#0"},
            				"south": {"uv": [5.5, 9.25, 6.75, 11.25], "rotation": 90, "texture": "#0"},
            				"west": {"uv": [4, 7, 0, 8.25], "texture": "#0"},
            				"up": {"uv": [6, 2, 10, 4], "rotation": 90, "texture": "#0"},
            				"down": {"uv": [6, 0, 10, 2], "rotation": 90, "texture": "#0"}
            			}
            		},
            		{
            			"from": [-4, 0, 14],
            			"to": [8, 4, 18],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 2, 16]},
            			"faces": {
            				"north": {"uv": [0, 8.25, 3.5, 9.25], "texture": "#0"},
            				"east": {"uv": [10, 6, 11, 7], "texture": "#0"},
            				"south": {"uv": [3.5, 8.25, 7, 9.25], "texture": "#0"},
            				"west": {"uv": [10, 3, 11, 4], "texture": "#0"},
            				"up": {"uv": [8, 11.75, 7, 8.25], "rotation": 270, "texture": "#0"},
            				"down": {"uv": [9, 8.25, 8, 11.75], "rotation": 90, "texture": "#0"}
            			}
            		},
            		{
            			"from": [-3, 4, 2],
            			"to": [-1, 4.5, 12],
            			"rotation": {"angle": 0, "axis": "y", "origin": [-2, 4.25, 7]},
            			"faces": {
            				"north": {"uv": [10, 3, 11, 4], "texture": "#0"},
            				"east": {"uv": [0, 8.25, 3.5, 9.25], "texture": "#0"},
            				"south": {"uv": [10, 6, 11, 7], "texture": "#0"},
            				"west": {"uv": [3.5, 8.25, 7, 9.25], "texture": "#0"},
            				"up": {"uv": [8, 11.75, 7, 8.25], "texture": "#0"},
            				"down": {"uv": [9, 8.25, 8, 11.75], "texture": "#0"}
            			}
            		},
            		{
            			"from": [17, 4, 2],
            			"to": [19, 4.5, 12],
            			"rotation": {"angle": 0, "axis": "y", "origin": [18, 4.25, 7]},
            			"faces": {
            				"north": {"uv": [10, 3, 11, 4], "texture": "#0"},
            				"east": {"uv": [0, 8.25, 3.5, 9.25], "texture": "#0"},
            				"south": {"uv": [10, 6, 11, 7], "texture": "#0"},
            				"west": {"uv": [3.5, 8.25, 7, 9.25], "texture": "#0"},
            				"up": {"uv": [8, 11.75, 7, 8.25], "texture": "#0"},
            				"down": {"uv": [9, 8.25, 8, 11.75], "texture": "#0"}
            			}
            		},
            		{
            			"from": [8, 0, 14],
            			"to": [20, 4, 18],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 2, 16]},
            			"faces": {
            				"north": {"uv": [9, 8.25, 12.5, 9.25], "texture": "#0"},
            				"east": {"uv": [10.25, 10.25, 11.25, 11.25], "texture": "#0"},
            				"south": {"uv": [0, 9.25, 3.5, 10.25], "texture": "#0"},
            				"west": {"uv": [10.25, 9.25, 11.25, 10.25], "texture": "#0"},
            				"up": {"uv": [4.5, 12.75, 3.5, 9.25], "rotation": 270, "texture": "#0"},
            				"down": {"uv": [5.5, 9.25, 4.5, 12.75], "rotation": 90, "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"rotation": [45, 0, 0],
            			"translation": [-6, 4, 2],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"thirdperson_lefthand": {
            			"rotation": [45, 0, 0],
            			"translation": [-6, 4, 2],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_righthand": {
            			"rotation": [45, 0, 0],
            			"translation": [2.25, 1.5, 2],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_lefthand": {
            			"rotation": [45, 0, 0],
            			"translation": [2.25, 1.5, 2],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.4, 0.4, 0.4]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [-0.25, 1, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [-180, 0, -180],
            			"translation": [0, 0, -1],
            			"scale": [0.4, 0.4, 0.4]
            		}
            	},
            	"groups": [
            		{
            			"name": "settee",
            			"origin": [8, 8, 8],
            			"color": 0,
            			"children": [0, 1, 2, 3, 4, 5]
            		}
            	]
            }
            """;

    public static final String SETTEE_1_MODEL_TEMPLATE = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [64, 64],
            	"textures": {
            		"0": "aestheticseating:block/settee_COLOR_NAME_VALUE",
            		"particle": "aestheticseating:block/settee_COLOR_NAME_VALUE"
            	},
            	"elements": [
            		{
            			"from": [-4, 0, 0],
            			"to": [20, 4, 14],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 2, 7]},
            			"faces": {
            				"north": {"uv": [6, 4, 12, 5], "texture": "#0"},
            				"east": {"uv": [4, 7.25, 7.5, 8.25], "texture": "#0"},
            				"south": {"uv": [6, 5, 12, 6], "texture": "#0"},
            				"west": {"uv": [7.5, 7.25, 11, 8.25], "texture": "#0"},
            				"up": {"uv": [6, 3.5, 0, 0], "texture": "#0"},
            				"down": {"uv": [6, 3.5, 0, 7], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 2.48254, -0.34462],
            			"to": [16, 10.48254, 4.65538],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 6.48254, 2.15538]},
            			"faces": {
            				"north": {"uv": [6, 0, 10, 2], "texture": "#0"},
            				"east": {"uv": [5.5, 9.25, 6.75, 11.25], "texture": "#0"},
            				"south": {"uv": [6, 2, 10, 4], "texture": "#0"},
            				"west": {"uv": [9, 9.25, 10.25, 11.25], "texture": "#0"},
            				"up": {"uv": [10, 7.25, 6, 6], "texture": "#0"},
            				"down": {"uv": [4, 7, 0, 8.25], "texture": "#0"}
            			}
            		},
            		{
            			"from": [1, 4.11313, 4.58239],
            			"to": [7, 10.11313, 6.58239],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [4, 7.11313, 5.58239]},
            			"faces": {
            				"north": {"uv": [0, 10.25, 1.5, 11.75], "texture": "#0"},
            				"east": {"uv": [5.5, 11.25, 6, 12.75], "texture": "#0"},
            				"south": {"uv": [1.5, 10.25, 3, 11.75], "texture": "#0"},
            				"west": {"uv": [6, 11.25, 6.5, 12.75], "texture": "#0"},
            				"up": {"uv": [12.5, 8, 11, 7.5], "texture": "#0"},
            				"down": {"uv": [10.5, 11.25, 9, 11.75], "texture": "#0"}
            			}
            		},
            		{
            			"from": [-4, 4.5, 0],
            			"to": [0, 8.5, 14],
            			"rotation": {"angle": 0, "axis": "y", "origin": [-2, 6.5, 7]},
            			"faces": {
            				"north": {"uv": [10, 3, 11, 4], "texture": "#0"},
            				"east": {"uv": [0, 8.25, 3.5, 9.25], "texture": "#0"},
            				"south": {"uv": [10, 6, 11, 7], "texture": "#0"},
            				"west": {"uv": [3.5, 8.25, 7, 9.25], "texture": "#0"},
            				"up": {"uv": [8, 11.75, 7, 8.25], "texture": "#0"},
            				"down": {"uv": [9, 8.25, 8, 11.75], "texture": "#0"}
            			}
            		},
            		{
            			"from": [-3, 4, 2],
            			"to": [-1, 4.5, 12],
            			"rotation": {"angle": 0, "axis": "y", "origin": [-2, 4.25, 7]},
            			"faces": {
            				"north": {"uv": [10, 3, 11, 4], "texture": "#0"},
            				"east": {"uv": [0, 8.25, 3.5, 9.25], "texture": "#0"},
            				"south": {"uv": [10, 6, 11, 7], "texture": "#0"},
            				"west": {"uv": [3.5, 8.25, 7, 9.25], "texture": "#0"},
            				"up": {"uv": [8, 11.75, 7, 8.25], "texture": "#0"},
            				"down": {"uv": [9, 8.25, 8, 11.75], "texture": "#0"}
            			}
            		},
            		{
            			"from": [17, 4, 2],
            			"to": [19, 4.5, 12],
            			"rotation": {"angle": 0, "axis": "y", "origin": [18, 4.25, 7]},
            			"faces": {
            				"north": {"uv": [10, 3, 11, 4], "texture": "#0"},
            				"east": {"uv": [0, 8.25, 3.5, 9.25], "texture": "#0"},
            				"south": {"uv": [10, 6, 11, 7], "texture": "#0"},
            				"west": {"uv": [3.5, 8.25, 7, 9.25], "texture": "#0"},
            				"up": {"uv": [8, 11.75, 7, 8.25], "texture": "#0"},
            				"down": {"uv": [9, 8.25, 8, 11.75], "texture": "#0"}
            			}
            		},
            		{
            			"from": [16, 4.5, 0],
            			"to": [20, 8.5, 14],
            			"rotation": {"angle": 0, "axis": "y", "origin": [18, 6.5, 7]},
            			"faces": {
            				"north": {"uv": [10.25, 9.25, 11.25, 10.25], "texture": "#0"},
            				"east": {"uv": [9, 8.25, 12.5, 9.25], "texture": "#0"},
            				"south": {"uv": [10.25, 10.25, 11.25, 11.25], "texture": "#0"},
            				"west": {"uv": [0, 9.25, 3.5, 10.25], "texture": "#0"},
            				"up": {"uv": [4.5, 12.75, 3.5, 9.25], "texture": "#0"},
            				"down": {"uv": [5.5, 9.25, 4.5, 12.75], "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"rotation": [45, 0, 0],
            			"translation": [-6, 4, 2],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"thirdperson_lefthand": {
            			"rotation": [45, 0, 0],
            			"translation": [-6, 4, 2],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_righthand": {
            			"rotation": [45, 0, 0],
            			"translation": [2.25, 1.5, 2],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_lefthand": {
            			"rotation": [45, 0, 0],
            			"translation": [2.25, 1.5, 2],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.4, 0.4, 0.4]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [-0.25, 1, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [-180, 0, -180],
            			"translation": [0, 0, -1],
            			"scale": [0.4, 0.4, 0.4]
            		}
            	},
            	"groups": [
            		{
            			"name": "settee",
            			"origin": [8, 8, 8],
            			"color": 0,
            			"children": [0, 1, 2, 3, 4, 5, 6]
            		}
            	]
            }
            """;

    public static final String SETTEE_TRANSFORMED_1_MODEL_TEMPLATE = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [64, 64],
            	"textures": {
            		"0": "aestheticseating:block/settee_COLOR_NAME_VALUE",
            		"particle": "aestheticseating:block/settee_COLOR_NAME_VALUE"
            	},
            	"elements": [
            		{
            			"from": [-4, 0, 0],
            			"to": [20, 4, 14],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 2, 7]},
            			"faces": {
            				"north": {"uv": [6, 4, 12, 5], "texture": "#0"},
            				"east": {"uv": [4, 7.25, 7.5, 8.25], "texture": "#0"},
            				"south": {"uv": [6, 5, 12, 6], "texture": "#0"},
            				"west": {"uv": [7.5, 7.25, 11, 8.25], "texture": "#0"},
            				"up": {"uv": [6, 3.5, 0, 0], "texture": "#0"},
            				"down": {"uv": [6, 3.5, 0, 7], "texture": "#0"}
            			}
            		},
            		{
            			"from": [-4, 1.98254, 0.15538],
            			"to": [4, 6.98254, 16.15538],
            			"rotation": {"angle": -45, "axis": "z", "origin": [0, 4.48254, 8.15538]},
            			"faces": {
            				"north": {"uv": [9, 9.25, 10.25, 11.25], "rotation": 270, "texture": "#0"},
            				"east": {"uv": [10, 7.25, 6, 6], "rotation": 180, "texture": "#0"},
            				"south": {"uv": [5.5, 9.25, 6.75, 11.25], "rotation": 90, "texture": "#0"},
            				"west": {"uv": [4, 7, 0, 8.25], "texture": "#0"},
            				"up": {"uv": [6, 2, 10, 4], "rotation": 90, "texture": "#0"},
            				"down": {"uv": [6, 0, 10, 2], "rotation": 90, "texture": "#0"}
            			}
            		},
            		{
            			"from": [13.8, 4.01313, 1.58239],
            			"to": [19.8, 6.01313, 7.58239],
            			"rotation": {"angle": 0, "axis": "y", "origin": [16.8, 5.01313, 4.58239]},
            			"faces": {
            				"north": {"uv": [5.5, 11.25, 6, 12.75], "rotation": 90, "texture": "#0"},
            				"east": {"uv": [10.5, 11.25, 9, 11.75], "texture": "#0"},
            				"south": {"uv": [6, 11.25, 6.5, 12.75], "rotation": 270, "texture": "#0"},
            				"west": {"uv": [12.5, 8, 11, 7.5], "rotation": 180, "texture": "#0"},
            				"up": {"uv": [1.5, 10.25, 3, 11.75], "rotation": 270, "texture": "#0"},
            				"down": {"uv": [0, 10.25, 1.5, 11.75], "rotation": 270, "texture": "#0"}
            			}
            		},
            		{
            			"from": [-4, 0, 14],
            			"to": [8, 4, 18],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 2, 16]},
            			"faces": {
            				"north": {"uv": [0, 8.25, 3.5, 9.25], "texture": "#0"},
            				"east": {"uv": [10, 6, 11, 7], "texture": "#0"},
            				"south": {"uv": [3.5, 8.25, 7, 9.25], "texture": "#0"},
            				"west": {"uv": [10, 3, 11, 4], "texture": "#0"},
            				"up": {"uv": [8, 11.75, 7, 8.25], "rotation": 270, "texture": "#0"},
            				"down": {"uv": [9, 8.25, 8, 11.75], "rotation": 90, "texture": "#0"}
            			}
            		},
            		{
            			"from": [-3, 4, 2],
            			"to": [-1, 4.5, 12],
            			"rotation": {"angle": 0, "axis": "y", "origin": [-2, 4.25, 7]},
            			"faces": {
            				"north": {"uv": [10, 3, 11, 4], "texture": "#0"},
            				"east": {"uv": [0, 8.25, 3.5, 9.25], "texture": "#0"},
            				"south": {"uv": [10, 6, 11, 7], "texture": "#0"},
            				"west": {"uv": [3.5, 8.25, 7, 9.25], "texture": "#0"},
            				"up": {"uv": [8, 11.75, 7, 8.25], "texture": "#0"},
            				"down": {"uv": [9, 8.25, 8, 11.75], "texture": "#0"}
            			}
            		},
            		{
            			"from": [17, 4, 2],
            			"to": [19, 4.5, 12],
            			"rotation": {"angle": 0, "axis": "y", "origin": [18, 4.25, 7]},
            			"faces": {
            				"north": {"uv": [10, 3, 11, 4], "texture": "#0"},
            				"east": {"uv": [0, 8.25, 3.5, 9.25], "texture": "#0"},
            				"south": {"uv": [10, 6, 11, 7], "texture": "#0"},
            				"west": {"uv": [3.5, 8.25, 7, 9.25], "texture": "#0"},
            				"up": {"uv": [8, 11.75, 7, 8.25], "texture": "#0"},
            				"down": {"uv": [9, 8.25, 8, 11.75], "texture": "#0"}
            			}
            		},
            		{
            			"from": [8, 0, 14],
            			"to": [20, 4, 18],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 2, 16]},
            			"faces": {
            				"north": {"uv": [9, 8.25, 12.5, 9.25], "texture": "#0"},
            				"east": {"uv": [10.25, 10.25, 11.25, 11.25], "texture": "#0"},
            				"south": {"uv": [0, 9.25, 3.5, 10.25], "texture": "#0"},
            				"west": {"uv": [10.25, 9.25, 11.25, 10.25], "texture": "#0"},
            				"up": {"uv": [4.5, 12.75, 3.5, 9.25], "rotation": 270, "texture": "#0"},
            				"down": {"uv": [5.5, 9.25, 4.5, 12.75], "rotation": 90, "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"rotation": [45, 0, 0],
            			"translation": [-6, 4, 2],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"thirdperson_lefthand": {
            			"rotation": [45, 0, 0],
            			"translation": [-6, 4, 2],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_righthand": {
            			"rotation": [45, 0, 0],
            			"translation": [2.25, 1.5, 2],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_lefthand": {
            			"rotation": [45, 0, 0],
            			"translation": [2.25, 1.5, 2],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.4, 0.4, 0.4]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [-0.25, 1, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [-180, 0, -180],
            			"translation": [0, 0, -1],
            			"scale": [0.4, 0.4, 0.4]
            		}
            	},
            	"groups": [
            		{
            			"name": "settee",
            			"origin": [8, 8, 8],
            			"color": 0,
            			"children": [0, 1, 2, 3, 4, 5, 6]
            		}
            	]
            }
            """;

    public static final String SETTEE_2_MODEL_TEMPLATE = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [64, 64],
            	"textures": {
            		"0": "aestheticseating:block/settee_COLOR_NAME_VALUE",
            		"particle": "aestheticseating:block/settee_COLOR_NAME_VALUE"
            	},
            	"elements": [
            		{
            			"from": [-4, 0, 0],
            			"to": [20, 4, 14],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 2, 7]},
            			"faces": {
            				"north": {"uv": [6, 4, 12, 5], "texture": "#0"},
            				"east": {"uv": [4, 7.25, 7.5, 8.25], "texture": "#0"},
            				"south": {"uv": [6, 5, 12, 6], "texture": "#0"},
            				"west": {"uv": [7.5, 7.25, 11, 8.25], "texture": "#0"},
            				"up": {"uv": [6, 3.5, 0, 0], "texture": "#0"},
            				"down": {"uv": [6, 3.5, 0, 7], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 2.48254, -0.34462],
            			"to": [16, 10.48254, 4.65538],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 6.48254, 2.15538]},
            			"faces": {
            				"north": {"uv": [6, 0, 10, 2], "texture": "#0"},
            				"east": {"uv": [5.5, 9.25, 6.75, 11.25], "texture": "#0"},
            				"south": {"uv": [6, 2, 10, 4], "texture": "#0"},
            				"west": {"uv": [9, 9.25, 10.25, 11.25], "texture": "#0"},
            				"up": {"uv": [10, 7.25, 6, 6], "texture": "#0"},
            				"down": {"uv": [4, 7, 0, 8.25], "texture": "#0"}
            			}
            		},
            		{
            			"from": [9, 4.11313, 4.58239],
            			"to": [15, 10.11313, 6.58239],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [12, 7.11313, 5.58239]},
            			"faces": {
            				"north": {"uv": [10, 0, 11.5, 1.5], "texture": "#0"},
            				"east": {"uv": [3, 10.25, 3.5, 11.75], "texture": "#0"},
            				"south": {"uv": [10, 1.5, 11.5, 3], "texture": "#0"},
            				"west": {"uv": [11, 6, 11.5, 7.5], "texture": "#0"},
            				"up": {"uv": [12.5, 3.5, 11, 3], "texture": "#0"},
            				"down": {"uv": [12.5, 3.5, 11, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [1, 4.11313, 4.58239],
            			"to": [7, 10.11313, 6.58239],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [4, 7.11313, 5.58239]},
            			"faces": {
            				"north": {"uv": [0, 10.25, 1.5, 11.75], "texture": "#0"},
            				"east": {"uv": [5.5, 11.25, 6, 12.75], "texture": "#0"},
            				"south": {"uv": [1.5, 10.25, 3, 11.75], "texture": "#0"},
            				"west": {"uv": [6, 11.25, 6.5, 12.75], "texture": "#0"},
            				"up": {"uv": [12.5, 8, 11, 7.5], "texture": "#0"},
            				"down": {"uv": [10.5, 11.25, 9, 11.75], "texture": "#0"}
            			}
            		},
            		{
            			"from": [-4, 4.5, 0],
            			"to": [0, 8.5, 14],
            			"rotation": {"angle": 0, "axis": "y", "origin": [-2, 6.5, 7]},
            			"faces": {
            				"north": {"uv": [10, 3, 11, 4], "texture": "#0"},
            				"east": {"uv": [0, 8.25, 3.5, 9.25], "texture": "#0"},
            				"south": {"uv": [10, 6, 11, 7], "texture": "#0"},
            				"west": {"uv": [3.5, 8.25, 7, 9.25], "texture": "#0"},
            				"up": {"uv": [8, 11.75, 7, 8.25], "texture": "#0"},
            				"down": {"uv": [9, 8.25, 8, 11.75], "texture": "#0"}
            			}
            		},
            		{
            			"from": [-3, 4, 2],
            			"to": [-1, 4.5, 12],
            			"rotation": {"angle": 0, "axis": "y", "origin": [-2, 4.25, 7]},
            			"faces": {
            				"north": {"uv": [10, 3, 11, 4], "texture": "#0"},
            				"east": {"uv": [0, 8.25, 3.5, 9.25], "texture": "#0"},
            				"south": {"uv": [10, 6, 11, 7], "texture": "#0"},
            				"west": {"uv": [3.5, 8.25, 7, 9.25], "texture": "#0"},
            				"up": {"uv": [8, 11.75, 7, 8.25], "texture": "#0"},
            				"down": {"uv": [9, 8.25, 8, 11.75], "texture": "#0"}
            			}
            		},
            		{
            			"from": [17, 4, 2],
            			"to": [19, 4.5, 12],
            			"rotation": {"angle": 0, "axis": "y", "origin": [18, 4.25, 7]},
            			"faces": {
            				"north": {"uv": [10, 3, 11, 4], "texture": "#0"},
            				"east": {"uv": [0, 8.25, 3.5, 9.25], "texture": "#0"},
            				"south": {"uv": [10, 6, 11, 7], "texture": "#0"},
            				"west": {"uv": [3.5, 8.25, 7, 9.25], "texture": "#0"},
            				"up": {"uv": [8, 11.75, 7, 8.25], "texture": "#0"},
            				"down": {"uv": [9, 8.25, 8, 11.75], "texture": "#0"}
            			}
            		},
            		{
            			"from": [16, 4.5, 0],
            			"to": [20, 8.5, 14],
            			"rotation": {"angle": 0, "axis": "y", "origin": [18, 6.5, 7]},
            			"faces": {
            				"north": {"uv": [10.25, 9.25, 11.25, 10.25], "texture": "#0"},
            				"east": {"uv": [9, 8.25, 12.5, 9.25], "texture": "#0"},
            				"south": {"uv": [10.25, 10.25, 11.25, 11.25], "texture": "#0"},
            				"west": {"uv": [0, 9.25, 3.5, 10.25], "texture": "#0"},
            				"up": {"uv": [4.5, 12.75, 3.5, 9.25], "texture": "#0"},
            				"down": {"uv": [5.5, 9.25, 4.5, 12.75], "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"rotation": [45, 0, 0],
            			"translation": [-6, 4, 2],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"thirdperson_lefthand": {
            			"rotation": [45, 0, 0],
            			"translation": [-6, 4, 2],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_righthand": {
            			"rotation": [45, 0, 0],
            			"translation": [2.25, 1.5, 2],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_lefthand": {
            			"rotation": [45, 0, 0],
            			"translation": [2.25, 1.5, 2],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.4, 0.4, 0.4]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [-0.25, 1, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [-180, 0, -180],
            			"translation": [0, 0, -1],
            			"scale": [0.4, 0.4, 0.4]
            		}
            	},
            	"groups": [
            		{
            			"name": "settee",
            			"origin": [8, 8, 8],
            			"color": 0,
            			"children": [0, 1, 2, 3, 4, 5, 6, 7]
            		}
            	]
            }
            """;

    public static final String SETTEE_TRANSFORMED_2_MODEL_TEMPLATE = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [64, 64],
            	"textures": {
            		"0": "aestheticseating:block/settee_COLOR_NAME_VALUE",
            		"particle": "aestheticseating:block/settee_COLOR_NAME_VALUE"
            	},
            	"elements": [
            		{
            			"from": [-4, 0, 0],
            			"to": [20, 4, 14],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 2, 7]},
            			"faces": {
            				"north": {"uv": [6, 4, 12, 5], "texture": "#0"},
            				"east": {"uv": [4, 7.25, 7.5, 8.25], "texture": "#0"},
            				"south": {"uv": [6, 5, 12, 6], "texture": "#0"},
            				"west": {"uv": [7.5, 7.25, 11, 8.25], "texture": "#0"},
            				"up": {"uv": [6, 3.5, 0, 0], "texture": "#0"},
            				"down": {"uv": [6, 3.5, 0, 7], "texture": "#0"}
            			}
            		},
            		{
            			"from": [-4, 1.98254, 0.15538],
            			"to": [4, 6.98254, 16.15538],
            			"rotation": {"angle": -45, "axis": "z", "origin": [0, 4.48254, 8.15538]},
            			"faces": {
            				"north": {"uv": [9, 9.25, 10.25, 11.25], "rotation": 270, "texture": "#0"},
            				"east": {"uv": [10, 7.25, 6, 6], "rotation": 180, "texture": "#0"},
            				"south": {"uv": [5.5, 9.25, 6.75, 11.25], "rotation": 90, "texture": "#0"},
            				"west": {"uv": [4, 7, 0, 8.25], "texture": "#0"},
            				"up": {"uv": [6, 2, 10, 4], "rotation": 90, "texture": "#0"},
            				"down": {"uv": [6, 0, 10, 2], "rotation": 90, "texture": "#0"}
            			}
            		},
            		{
            			"from": [13.8, 4.01313, 7.58239],
            			"to": [19.8, 6.01313, 13.58239],
            			"rotation": {"angle": 0, "axis": "z", "origin": [16.8, 5.01313, 10.58239]},
            			"faces": {
            				"north": {"uv": [3, 10.25, 3.5, 11.75], "rotation": 90, "texture": "#0"},
            				"east": {"uv": [12.5, 3.5, 11, 4], "texture": "#0"},
            				"south": {"uv": [11, 6, 11.5, 7.5], "rotation": 270, "texture": "#0"},
            				"west": {"uv": [12.5, 3.5, 11, 3], "rotation": 180, "texture": "#0"},
            				"up": {"uv": [10, 1.5, 11.5, 3], "rotation": 270, "texture": "#0"},
            				"down": {"uv": [10, 0, 11.5, 1.5], "rotation": 270, "texture": "#0"}
            			}
            		},
            		{
            			"from": [13.8, 4.01313, 1.58239],
            			"to": [19.8, 6.01313, 7.58239],
            			"rotation": {"angle": 0, "axis": "z", "origin": [16.8, 5.01313, 4.58239]},
            			"faces": {
            				"north": {"uv": [5.5, 11.25, 6, 12.75], "rotation": 90, "texture": "#0"},
            				"east": {"uv": [10.5, 11.25, 9, 11.75], "texture": "#0"},
            				"south": {"uv": [6, 11.25, 6.5, 12.75], "rotation": 270, "texture": "#0"},
            				"west": {"uv": [12.5, 8, 11, 7.5], "rotation": 180, "texture": "#0"},
            				"up": {"uv": [1.5, 10.25, 3, 11.75], "rotation": 270, "texture": "#0"},
            				"down": {"uv": [0, 10.25, 1.5, 11.75], "rotation": 270, "texture": "#0"}
            			}
            		},
            		{
            			"from": [-4, 0, 14],
            			"to": [8, 4, 18],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 2, 16]},
            			"faces": {
            				"north": {"uv": [0, 8.25, 3.5, 9.25], "texture": "#0"},
            				"east": {"uv": [10, 6, 11, 7], "texture": "#0"},
            				"south": {"uv": [3.5, 8.25, 7, 9.25], "texture": "#0"},
            				"west": {"uv": [10, 3, 11, 4], "texture": "#0"},
            				"up": {"uv": [8, 11.75, 7, 8.25], "rotation": 270, "texture": "#0"},
            				"down": {"uv": [9, 8.25, 8, 11.75], "rotation": 90, "texture": "#0"}
            			}
            		},
            		{
            			"from": [-3, 4, 2],
            			"to": [-1, 4.5, 12],
            			"rotation": {"angle": 0, "axis": "y", "origin": [-2, 4.25, 7]},
            			"faces": {
            				"north": {"uv": [10, 3, 11, 4], "texture": "#0"},
            				"east": {"uv": [0, 8.25, 3.5, 9.25], "texture": "#0"},
            				"south": {"uv": [10, 6, 11, 7], "texture": "#0"},
            				"west": {"uv": [3.5, 8.25, 7, 9.25], "texture": "#0"},
            				"up": {"uv": [8, 11.75, 7, 8.25], "texture": "#0"},
            				"down": {"uv": [9, 8.25, 8, 11.75], "texture": "#0"}
            			}
            		},
            		{
            			"from": [17, 4, 2],
            			"to": [19, 4.5, 12],
            			"rotation": {"angle": 0, "axis": "y", "origin": [18, 4.25, 7]},
            			"faces": {
            				"north": {"uv": [10, 3, 11, 4], "texture": "#0"},
            				"east": {"uv": [0, 8.25, 3.5, 9.25], "texture": "#0"},
            				"south": {"uv": [10, 6, 11, 7], "texture": "#0"},
            				"west": {"uv": [3.5, 8.25, 7, 9.25], "texture": "#0"},
            				"up": {"uv": [8, 11.75, 7, 8.25], "texture": "#0"},
            				"down": {"uv": [9, 8.25, 8, 11.75], "texture": "#0"}
            			}
            		},
            		{
            			"from": [8, 0, 14],
            			"to": [20, 4, 18],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 2, 16]},
            			"faces": {
            				"north": {"uv": [9, 8.25, 12.5, 9.25], "texture": "#0"},
            				"east": {"uv": [10.25, 10.25, 11.25, 11.25], "texture": "#0"},
            				"south": {"uv": [0, 9.25, 3.5, 10.25], "texture": "#0"},
            				"west": {"uv": [10.25, 9.25, 11.25, 10.25], "texture": "#0"},
            				"up": {"uv": [4.5, 12.75, 3.5, 9.25], "rotation": 270, "texture": "#0"},
            				"down": {"uv": [5.5, 9.25, 4.5, 12.75], "rotation": 90, "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"rotation": [45, 0, 0],
            			"translation": [-6, 4, 2],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"thirdperson_lefthand": {
            			"rotation": [45, 0, 0],
            			"translation": [-6, 4, 2],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_righthand": {
            			"rotation": [45, 0, 0],
            			"translation": [2.25, 1.5, 2],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_lefthand": {
            			"rotation": [45, 0, 0],
            			"translation": [2.25, 1.5, 2],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.4, 0.4, 0.4]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [-0.25, 1, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"fixed": {
            			"rotation": [-180, 0, -180],
            			"translation": [0, 0, -1],
            			"scale": [0.4, 0.4, 0.4]
            		}
            	},
            	"groups": [
            		{
            			"name": "settee",
            			"origin": [8, 8, 8],
            			"color": 0,
            			"children": [0, 1, 2, 3, 4, 5, 6, 7]
            		}
            	]
            }
            """;

    public static final String SETTEE_BLOCKSTATE_TEMPLATE = """
            {
              "variants":
              {
                "facing=north,transformed=false,variant=0": { "model": "aestheticseating:block/settee_COLOR_NAME_VALUE_0" },
                "facing=south,transformed=false,variant=0": { "model": "aestheticseating:block/settee_COLOR_NAME_VALUE_0", "y": 180 },
                "facing=west,transformed=false,variant=0": { "model": "aestheticseating:block/settee_COLOR_NAME_VALUE_0", "y": 270 },
                "facing=east,transformed=false,variant=0": { "model": "aestheticseating:block/settee_COLOR_NAME_VALUE_0", "y": 90 },
                "facing=north,transformed=true,variant=0": { "model": "aestheticseating:block/settee_COLOR_NAME_VALUE_transformed_0" },
                "facing=south,transformed=true,variant=0": { "model": "aestheticseating:block/settee_COLOR_NAME_VALUE_transformed_0", "y": 180 },
                "facing=west,transformed=true,variant=0": { "model": "aestheticseating:block/settee_COLOR_NAME_VALUE_transformed_0", "y": 270 },
                "facing=east,transformed=true,variant=0": { "model": "aestheticseating:block/settee_COLOR_NAME_VALUE_transformed_0", "y": 90 },
                "facing=north,transformed=false,variant=1": { "model": "aestheticseating:block/settee_COLOR_NAME_VALUE_1" },
                "facing=south,transformed=false,variant=1": { "model": "aestheticseating:block/settee_COLOR_NAME_VALUE_1", "y": 180 },
                "facing=west,transformed=false,variant=1": { "model": "aestheticseating:block/settee_COLOR_NAME_VALUE_1", "y": 270 },
                "facing=east,transformed=false,variant=1": { "model": "aestheticseating:block/settee_COLOR_NAME_VALUE_1", "y": 90 },
                "facing=north,transformed=true,variant=1": { "model": "aestheticseating:block/settee_COLOR_NAME_VALUE_transformed_1" },
                "facing=south,transformed=true,variant=1": { "model": "aestheticseating:block/settee_COLOR_NAME_VALUE_transformed_1", "y": 180 },
                "facing=west,transformed=true,variant=1": { "model": "aestheticseating:block/settee_COLOR_NAME_VALUE_transformed_1", "y": 270 },
                "facing=east,transformed=true,variant=1": { "model": "aestheticseating:block/settee_COLOR_NAME_VALUE_transformed_1", "y": 90 },
                "facing=north,transformed=false,variant=2": { "model": "aestheticseating:block/settee_COLOR_NAME_VALUE_2" },
                "facing=south,transformed=false,variant=2": { "model": "aestheticseating:block/settee_COLOR_NAME_VALUE_2", "y": 180 },
                "facing=west,transformed=false,variant=2": { "model": "aestheticseating:block/settee_COLOR_NAME_VALUE_2", "y": 270 },
                "facing=east,transformed=false,variant=2": { "model": "aestheticseating:block/settee_COLOR_NAME_VALUE_2", "y": 90 },
                "facing=north,transformed=true,variant=2": { "model": "aestheticseating:block/settee_COLOR_NAME_VALUE_transformed_2" },
                "facing=south,transformed=true,variant=2": { "model": "aestheticseating:block/settee_COLOR_NAME_VALUE_transformed_2", "y": 180 },
                "facing=west,transformed=true,variant=2": { "model": "aestheticseating:block/settee_COLOR_NAME_VALUE_transformed_2", "y": 270 },
                "facing=east,transformed=true,variant=2": { "model": "aestheticseating:block/settee_COLOR_NAME_VALUE_transformed_2", "y": 90 }
              }
            }
            """;

    public static final String CUSHION_MODEL_TEMPLATE = """
            {
              	"credit": "Made with Blockbench",
              	"textures": {
              		"0": "aestheticseating:block/COLOR_NAME_VALUE_wool",
              		"particle": "aestheticseating:block/COLOR_NAME_VALUE_wool"
              	},
              	"elements": [
              		{
              			"from": [3, 0, 3],
              			"to": [13, 4, 13],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 1, 8]},
              			"faces": {
              				"north": {"uv": [6, 0, 12, 2], "texture": "#0"},
              				"east": {"uv": [6, 2, 12, 4], "texture": "#0"},
              				"south": {"uv": [6, 4, 12, 6], "texture": "#0"},
              				"west": {"uv": [6, 6, 12, 8], "texture": "#0"},
              				"up": {"uv": [6, 6, 0, 0], "texture": "#0"},
              				"down": {"uv": [6, 6, 0, 12], "texture": "#0"}
              			}
              		}
              	],
              	"display": {
              		"thirdperson_righthand": {
              			"rotation": [-56.75, 0, 0],
              			"translation": [0, 4.25, -2.25],
              			"scale": [0.7, 0.7, 0.7]
              		},
              		"thirdperson_lefthand": {
              			"rotation": [-56.75, 0, 0],
              			"translation": [0, 4.25, -2.25],
              			"scale": [0.7, 0.7, 0.7]
              		},
              		"firstperson_righthand": {
              			"rotation": [56.75, 0, 0],
              			"translation": [0, 7, 7],
              			"scale": [0.7, 0.7, 0.7]
              		},
              		"firstperson_lefthand": {
              			"rotation": [56.75, 0, 0],
              			"translation": [0, 7, 7],
              			"scale": [0.7, 0.7, 0.7]
              		},
              		"ground": {
              			"translation": [0, 4, 0]
              		},
              		"gui": {
              			"rotation": [20, 45, 0],
              			"translation": [0, 6, 0]
              		},
              		"fixed": {
              			"rotation": [90, 0, 0],
              			"translation": [0, 0, 6]
              		}
              	}
              }
            """;

    public static final String SIMPLE_STOOL_NORMAL_MODEL_TEMPLATE = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [32, 32],
            	"textures": {
            		"0": "aestheticseating:block/simple_stool_WOOD_NAME_VALUE",
            		"particle": "aestheticseating:block/simple_stool_WOOD_NAME_VALUE"
            	},
            	"elements": [
            		{
            			"name": "leg1",
            			"from": [4, 0, 4],
            			"to": [5.5, 7, 5.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3.75, 0, 3.75]},
            			"faces": {
            				"north": {"uv": [4.5, 0, 5.5, 3.5], "texture": "#0"},
            				"east": {"uv": [4.5, 3.5, 5.5, 7], "texture": "#0"},
            				"south": {"uv": [5.5, 0, 6.5, 3.5], "texture": "#0"},
            				"west": {"uv": [5.5, 3.5, 6.5, 7], "texture": "#0"},
            				"up": {"uv": [2.5, 11, 1.5, 10], "texture": "#0"},
            				"down": {"uv": [3.5, 10, 2.5, 11], "texture": "#0"}
            			}
            		},
            		{
            			"name": "leg2",
            			"from": [4, 0, 10.5],
            			"to": [5.5, 7, 12],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3.75, 0, 10.25]},
            			"faces": {
            				"north": {"uv": [6.5, 0, 7.5, 3.5], "texture": "#0"},
            				"east": {"uv": [6.5, 3.5, 7.5, 7], "texture": "#0"},
            				"south": {"uv": [4.5, 7, 5.5, 10.5], "texture": "#0"},
            				"west": {"uv": [5.5, 7, 6.5, 10.5], "texture": "#0"},
            				"up": {"uv": [8, 11.5, 7, 10.5], "texture": "#0"},
            				"down": {"uv": [9, 10.5, 8, 11.5], "texture": "#0"}
            			}
            		},
            		{
            			"name": "leg3",
            			"from": [10.5, 0, 10.5],
            			"to": [12, 7, 12],
            			"rotation": {"angle": 0, "axis": "y", "origin": [10.25, 0, 10.25]},
            			"faces": {
            				"north": {"uv": [6.5, 7, 7.5, 10.5], "texture": "#0"},
            				"east": {"uv": [7.5, 0, 8.5, 3.5], "texture": "#0"},
            				"south": {"uv": [7.5, 3.5, 8.5, 7], "texture": "#0"},
            				"west": {"uv": [7.5, 7, 8.5, 10.5], "texture": "#0"},
            				"up": {"uv": [11, 11.5, 10, 10.5], "texture": "#0"},
            				"down": {"uv": [2.5, 11, 1.5, 12], "texture": "#0"}
            			}
            		},
            		{
            			"name": "leg4",
            			"from": [10.5, 0, 4],
            			"to": [12, 7, 5.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [10.25, 0, 3.75]},
            			"faces": {
            				"north": {"uv": [8.5, 0, 9.5, 3.5], "texture": "#0"},
            				"east": {"uv": [8.5, 3.5, 9.5, 7], "texture": "#0"},
            				"south": {"uv": [8.5, 7, 9.5, 10.5], "texture": "#0"},
            				"west": {"uv": [0, 9, 1, 12.5], "texture": "#0"},
            				"up": {"uv": [3.5, 12, 2.5, 11], "texture": "#0"},
            				"down": {"uv": [5.5, 11, 4.5, 12], "texture": "#0"}
            			}
            		},
            		{
            			"name": "seat",
            			"from": [3.45, 7, 3.5],
            			"to": [12.55, 8, 12.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 7, 2.75]},
            			"faces": {
            				"north": {"uv": [9.5, 7, 14, 7.5], "texture": "#0"},
            				"east": {"uv": [9.5, 7.5, 14, 8], "texture": "#0"},
            				"south": {"uv": [9.5, 8, 14, 8.5], "texture": "#0"},
            				"west": {"uv": [9.5, 8.5, 14, 9], "texture": "#0"},
            				"up": {"uv": [4.5, 4.5, 0, 0], "texture": "#0"},
            				"down": {"uv": [4.5, 4.5, 0, 9], "texture": "#0"}
            			}
            		},
            		{
            			"name": "support1",
            			"from": [4.35, 5.25, 5.5],
            			"to": [5.15, 7, 10.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3.5, 5, 9]},
            			"faces": {
            				"north": {"uv": [9, 10.5, 9.5, 11.5], "texture": "#0"},
            				"east": {"uv": [1, 9, 3.5, 10], "texture": "#0"},
            				"south": {"uv": [5.5, 11, 6, 12], "texture": "#0"},
            				"west": {"uv": [9.5, 0, 12, 1], "texture": "#0"},
            				"up": {"uv": [4, 11.5, 3.5, 9], "texture": "#0"},
            				"down": {"uv": [4.5, 9, 4, 11.5], "texture": "#0"}
            			}
            		},
            		{
            			"name": "support2",
            			"from": [10.85, 5.25, 5.5],
            			"to": [11.65, 7, 10.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [10, 5, 9]},
            			"faces": {
            				"north": {"uv": [6, 11, 6.5, 12], "texture": "#0"},
            				"east": {"uv": [9.5, 1, 12, 2], "texture": "#0"},
            				"south": {"uv": [6.5, 11, 7, 12], "texture": "#0"},
            				"west": {"uv": [9.5, 2, 12, 3], "texture": "#0"},
            				"up": {"uv": [10, 11.5, 9.5, 9], "texture": "#0"},
            				"down": {"uv": [1.5, 10, 1, 12.5], "texture": "#0"}
            			}
            		},
            		{
            			"name": "support3",
            			"from": [5.5, 5.25, 10.85],
            			"to": [10.5, 7, 11.65],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4.25, 5, 14.75]},
            			"faces": {
            				"north": {"uv": [9.5, 3, 12, 4], "texture": "#0"},
            				"east": {"uv": [11, 10.5, 11.5, 11.5], "texture": "#0"},
            				"south": {"uv": [9.5, 4, 12, 5], "texture": "#0"},
            				"west": {"uv": [3.5, 11.5, 4, 12.5], "texture": "#0"},
            				"up": {"uv": [12.5, 9.5, 10, 9], "texture": "#0"},
            				"down": {"uv": [12.5, 9.5, 10, 10], "texture": "#0"}
            			}
            		},
            		{
            			"name": "support4",
            			"from": [5.5, 5.25, 4.35],
            			"to": [10.5, 7, 5.15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4.25, 5, 8.25]},
            			"faces": {
            				"north": {"uv": [9.5, 5, 12, 6], "texture": "#0"},
            				"east": {"uv": [4, 11.5, 4.5, 12.5], "texture": "#0"},
            				"south": {"uv": [9.5, 6, 12, 7], "texture": "#0"},
            				"west": {"uv": [7, 11.5, 7.5, 12.5], "texture": "#0"},
            				"up": {"uv": [12.5, 10.5, 10, 10], "texture": "#0"},
            				"down": {"uv": [7, 10.5, 4.5, 11], "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_righthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_lefthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"ground": {
            			"translation": [0, 2.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [0, -0.25, 0],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"fixed": {
            			"rotation": [0, 90, 0],
            			"translation": [0, 0, 1],
            			"scale": [0.6, 0.6, 0.6]
            		}
            	},
            	"groups": [
            		{
            			"name": "chair_shape",
            			"origin": [4.25, 5, 7.75],
            			"color": 0,
            			"children": [0, 1, 2, 3, 4, 5, 6, 7, 8]
            		}
            	]
            }
            """;

    public static final String SIMPLE_STOOL_LATTICEBACK_MODEL_TEMPLATE = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [32, 32],
            	"textures": {
            		"0": "aestheticseating:block/latticeback_chair_WOOD_NAME_VALUE",
            		"particle": "aestheticseating:block/latticeback_chair_WOOD_NAME_VALUE"
            	},
            	"elements": [
            		{
            			"name": "leg1",
            			"from": [3.5, 0, 3.5],
            			"to": [5, 7, 5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3.25, 0, 3.25]},
            			"faces": {
            				"north": {"uv": [5, 0, 6, 3.5], "texture": "#0"},
            				"east": {"uv": [5, 3.5, 6, 7], "texture": "#0"},
            				"south": {"uv": [6, 0, 7, 3.5], "texture": "#0"},
            				"west": {"uv": [6, 3.5, 7, 7], "texture": "#0"},
            				"up": {"uv": [4, 10, 3, 9], "texture": "#0"},
            				"down": {"uv": [5, 9, 4, 10], "texture": "#0"}
            			}
            		},
            		{
            			"name": "leg2",
            			"from": [3.5, 0, 11],
            			"to": [5, 7, 12.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3.25, 0, 10.75]},
            			"faces": {
            				"north": {"uv": [7, 0, 8, 3.5], "texture": "#0"},
            				"east": {"uv": [7, 3.5, 8, 7], "texture": "#0"},
            				"south": {"uv": [5, 7, 6, 10.5], "texture": "#0"},
            				"west": {"uv": [6, 7, 7, 10.5], "texture": "#0"},
            				"up": {"uv": [3, 13.5, 2, 12.5], "texture": "#0"},
            				"down": {"uv": [13.5, 3.5, 12.5, 4.5], "texture": "#0"}
            			}
            		},
            		{
            			"name": "leg3",
            			"from": [11, 0, 11],
            			"to": [12.5, 7, 12.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [10.75, 0, 10.75]},
            			"faces": {
            				"north": {"uv": [7, 7, 8, 10.5], "texture": "#0"},
            				"east": {"uv": [8, 0, 9, 3.5], "texture": "#0"},
            				"south": {"uv": [8, 3.5, 9, 7], "texture": "#0"},
            				"west": {"uv": [8, 7, 9, 10.5], "texture": "#0"},
            				"up": {"uv": [13.5, 5.5, 12.5, 4.5], "texture": "#0"},
            				"down": {"uv": [13.5, 5.5, 12.5, 6.5], "texture": "#0"}
            			}
            		},
            		{
            			"name": "leg4",
            			"from": [11, 0, 3.5],
            			"to": [12.5, 7, 5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [10.75, 0, 3.25]},
            			"faces": {
            				"north": {"uv": [0, 9, 1, 12.5], "texture": "#0"},
            				"east": {"uv": [9, 0, 10, 3.5], "texture": "#0"},
            				"south": {"uv": [1, 9, 2, 12.5], "texture": "#0"},
            				"west": {"uv": [2, 9, 3, 12.5], "texture": "#0"},
            				"up": {"uv": [13.5, 7.5, 12.5, 6.5], "texture": "#0"},
            				"down": {"uv": [13.5, 10, 12.5, 11], "texture": "#0"}
            			}
            		},
            		{
            			"name": "seat",
            			"from": [3.2, 7, 4.25],
            			"to": [12.8, 8, 13],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 7, 3]},
            			"faces": {
            				"north": {"uv": [10, 1, 15, 1.5], "texture": "#0"},
            				"east": {"uv": [8, 10.5, 12.5, 11], "texture": "#0"},
            				"south": {"uv": [10, 1.5, 15, 2], "texture": "#0"},
            				"west": {"uv": [3, 11, 7.5, 11.5], "texture": "#0"},
            				"up": {"uv": [5, 4.5, 0, 0], "texture": "#0"},
            				"down": {"uv": [5, 4.5, 0, 9], "texture": "#0"}
            			}
            		},
            		{
            			"name": "back",
            			"from": [3.5, 7, 3.25],
            			"to": [4.5, 16, 4.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3.25, 7, 3.25]},
            			"faces": {
            				"north": {"uv": [7.5, 11, 8, 15.5], "texture": "#0"},
            				"east": {"uv": [8, 11, 8.5, 15.5], "texture": "#0"},
            				"south": {"uv": [8.5, 11, 9, 15.5], "texture": "#0"},
            				"west": {"uv": [9, 11, 9.5, 15.5], "texture": "#0"},
            				"up": {"uv": [3.5, 10.5, 3, 10], "texture": "#0"},
            				"down": {"uv": [4, 10, 3.5, 10.5], "texture": "#0"}
            			}
            		},
            		{
            			"name": "back",
            			"from": [3.25, 16, 3.25],
            			"to": [12.75, 17, 4.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3.25, 16, 3.25]},
            			"faces": {
            				"north": {"uv": [10, 2, 15, 2.5], "texture": "#0"},
            				"east": {"uv": [4, 10, 4.5, 10.5], "texture": "#0"},
            				"south": {"uv": [10, 2.5, 15, 3], "texture": "#0"},
            				"west": {"uv": [4.5, 10, 5, 10.5], "texture": "#0"},
            				"up": {"uv": [15, 3.5, 10, 3], "texture": "#0"},
            				"down": {"uv": [8, 10.5, 3, 11], "texture": "#0"}
            			}
            		},
            		{
            			"name": "back",
            			"from": [5.25, 7, 3.25],
            			"to": [6.25, 16, 4.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [5, 7, 3.25]},
            			"faces": {
            				"north": {"uv": [9.5, 11, 10, 15.5], "texture": "#0"},
            				"east": {"uv": [10, 11, 10.5, 15.5], "texture": "#0"},
            				"south": {"uv": [10.5, 11, 11, 15.5], "texture": "#0"},
            				"west": {"uv": [11, 11, 11.5, 15.5], "texture": "#0"},
            				"up": {"uv": [12.5, 10.5, 12, 10], "texture": "#0"},
            				"down": {"uv": [13, 7.5, 12.5, 8], "texture": "#0"}
            			}
            		},
            		{
            			"name": "back",
            			"from": [7.25, 7, 3.25],
            			"to": [8.25, 16, 4.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [7, 7, 3.25]},
            			"faces": {
            				"north": {"uv": [3, 11.5, 3.5, 16], "texture": "#0"},
            				"east": {"uv": [3.5, 11.5, 4, 16], "texture": "#0"},
            				"south": {"uv": [4, 11.5, 4.5, 16], "texture": "#0"},
            				"west": {"uv": [4.5, 11.5, 5, 16], "texture": "#0"},
            				"up": {"uv": [13.5, 8, 13, 7.5], "texture": "#0"},
            				"down": {"uv": [2.5, 13.5, 2, 14], "texture": "#0"}
            			}
            		},
            		{
            			"name": "back",
            			"from": [9.25, 7, 3.25],
            			"to": [10.25, 16, 4.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [9, 7, 3.25]},
            			"faces": {
            				"north": {"uv": [5, 11.5, 5.5, 16], "texture": "#0"},
            				"east": {"uv": [5.5, 11.5, 6, 16], "texture": "#0"},
            				"south": {"uv": [6, 11.5, 6.5, 16], "texture": "#0"},
            				"west": {"uv": [6.5, 11.5, 7, 16], "texture": "#0"},
            				"up": {"uv": [3, 14, 2.5, 13.5], "texture": "#0"},
            				"down": {"uv": [14, 3.5, 13.5, 4], "texture": "#0"}
            			}
            		},
            		{
            			"name": "back",
            			"from": [11.5, 7, 3.25],
            			"to": [12.5, 16, 4.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [11.25, 7, 3.25]},
            			"faces": {
            				"north": {"uv": [7, 11.5, 7.5, 16], "texture": "#0"},
            				"east": {"uv": [11.5, 11, 12, 15.5], "texture": "#0"},
            				"south": {"uv": [12, 3.5, 12.5, 8], "texture": "#0"},
            				"west": {"uv": [12, 11, 12.5, 15.5], "texture": "#0"},
            				"up": {"uv": [14, 4.5, 13.5, 4], "texture": "#0"},
            				"down": {"uv": [14, 4.5, 13.5, 5], "texture": "#0"}
            			}
            		},
            		{
            			"name": "support1",
            			"from": [3.85, 5.25, 5],
            			"to": [4.65, 7, 11],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 5, 9]},
            			"faces": {
            				"north": {"uv": [12.5, 11, 13, 12], "texture": "#0"},
            				"east": {"uv": [9, 3.5, 12, 4.5], "texture": "#0"},
            				"south": {"uv": [12.5, 12, 13, 13], "texture": "#0"},
            				"west": {"uv": [9, 4.5, 12, 5.5], "texture": "#0"},
            				"up": {"uv": [0.5, 15.5, 0, 12.5], "texture": "#0"},
            				"down": {"uv": [1, 12.5, 0.5, 15.5], "texture": "#0"}
            			}
            		},
            		{
            			"name": "support2",
            			"from": [11.35, 5.25, 5],
            			"to": [12.15, 7, 11],
            			"rotation": {"angle": 0, "axis": "y", "origin": [10.5, 5, 9]},
            			"faces": {
            				"north": {"uv": [13, 0, 13.5, 1], "texture": "#0"},
            				"east": {"uv": [9, 5.5, 12, 6.5], "texture": "#0"},
            				"south": {"uv": [13, 11, 13.5, 12], "texture": "#0"},
            				"west": {"uv": [9, 6.5, 12, 7.5], "texture": "#0"},
            				"up": {"uv": [1.5, 15.5, 1, 12.5], "texture": "#0"},
            				"down": {"uv": [2, 12.5, 1.5, 15.5], "texture": "#0"}
            			}
            		},
            		{
            			"name": "support3",
            			"from": [5, 5.25, 11.35],
            			"to": [11, 7, 12.15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4.25, 5, 15.25]},
            			"faces": {
            				"north": {"uv": [9, 7.5, 12, 8.5], "texture": "#0"},
            				"east": {"uv": [13, 12, 13.5, 13], "texture": "#0"},
            				"south": {"uv": [9, 8.5, 12, 9.5], "texture": "#0"},
            				"west": {"uv": [12.5, 13, 13, 14], "texture": "#0"},
            				"up": {"uv": [15, 8.5, 12, 8], "texture": "#0"},
            				"down": {"uv": [15, 8.5, 12, 9], "texture": "#0"}
            			}
            		},
            		{
            			"name": "support4",
            			"from": [5, 5.25, 3.85],
            			"to": [11, 7, 4.65],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4.25, 5, 7.75]},
            			"faces": {
            				"north": {"uv": [9, 9.5, 12, 10.5], "texture": "#0"},
            				"east": {"uv": [13, 13, 13.5, 14], "texture": "#0"},
            				"south": {"uv": [10, 0, 13, 1], "texture": "#0"},
            				"west": {"uv": [13.5, 0, 14, 1], "texture": "#0"},
            				"up": {"uv": [15, 9.5, 12, 9], "texture": "#0"},
            				"down": {"uv": [15, 9.5, 12, 10], "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_righthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_lefthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"ground": {
            			"translation": [0, 2.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [0, -0.25, 0],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"fixed": {
            			"rotation": [0, 90, 0],
            			"translation": [0, 0, 1],
            			"scale": [0.6, 0.6, 0.6]
            		}
            	},
            	"groups": [
            		{
            			"name": "chair_shape",
            			"origin": [4.25, 5, 7.75],
            			"color": 0,
            			"children": [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]
            		}
            	]
            }
            """;

    public static final String SIMPLE_STOOL_DESK_MODEL_TEMPLATE = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [32, 32],
            	"textures": {
            		"2": "aestheticseating:block/desk_chair_WOOD_NAME_VALUE",
            		"particle": "aestheticseating:block/desk_chair_WOOD_NAME_VALUE"
            	},
            	"elements": [
            		{
            			"name": "leg1",
            			"from": [4, 0, 4.5],
            			"to": [5.5, 7, 6],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4.75, 3.5, 5.25]},
            			"faces": {
            				"north": {"uv": [4.5, 4, 5.5, 7.5], "texture": "#2"},
            				"east": {"uv": [5.5, 4, 6.5, 7.5], "texture": "#2"},
            				"south": {"uv": [6.5, 4, 7.5, 7.5], "texture": "#2"},
            				"west": {"uv": [7.5, 4, 8.5, 7.5], "texture": "#2"},
            				"up": {"uv": [6.5, 13.5, 5.5, 12.5], "texture": "#2"},
            				"down": {"uv": [7.5, 12.5, 6.5, 13.5], "texture": "#2"}
            			}
            		},
            		{
            			"name": "leg2",
            			"from": [4, 0, 10.5],
            			"to": [5.5, 7, 12],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4.75, 3.5, 11.25]},
            			"faces": {
            				"north": {"uv": [4.5, 7.5, 5.5, 11], "texture": "#2"},
            				"east": {"uv": [5.5, 7.5, 6.5, 11], "texture": "#2"},
            				"south": {"uv": [6.5, 7.5, 7.5, 11], "texture": "#2"},
            				"west": {"uv": [7.5, 7.5, 8.5, 11], "texture": "#2"},
            				"up": {"uv": [13.5, 8, 12.5, 7], "texture": "#2"},
            				"down": {"uv": [8.5, 12.5, 7.5, 13.5], "texture": "#2"}
            			}
            		},
            		{
            			"name": "leg3",
            			"from": [10.5, 0, 10.5],
            			"to": [12, 7, 12],
            			"rotation": {"angle": 0, "axis": "y", "origin": [11.25, 3.5, 11.25]},
            			"faces": {
            				"north": {"uv": [0, 8, 1, 11.5], "texture": "#2"},
            				"east": {"uv": [1, 8, 2, 11.5], "texture": "#2"},
            				"south": {"uv": [2, 8, 3, 11.5], "texture": "#2"},
            				"west": {"uv": [3, 8, 4, 11.5], "texture": "#2"},
            				"up": {"uv": [13.5, 9, 12.5, 8], "texture": "#2"},
            				"down": {"uv": [9.5, 12.5, 8.5, 13.5], "texture": "#2"}
            			}
            		},
            		{
            			"name": "leg4",
            			"from": [10.5, 0, 4.5],
            			"to": [12, 7, 6],
            			"rotation": {"angle": 0, "axis": "y", "origin": [11.25, 3.5, 5.25]},
            			"faces": {
            				"north": {"uv": [8.5, 4, 9.5, 7.5], "texture": "#2"},
            				"east": {"uv": [8.5, 7.5, 9.5, 11], "texture": "#2"},
            				"south": {"uv": [9, 0, 10, 3.5], "texture": "#2"},
            				"west": {"uv": [9.5, 3.5, 10.5, 7], "texture": "#2"},
            				"up": {"uv": [13.5, 10, 12.5, 9], "texture": "#2"},
            				"down": {"uv": [10.5, 12.5, 9.5, 13.5], "texture": "#2"}
            			}
            		},
            		{
            			"name": "seat",
            			"from": [3.7, 7, 4.25],
            			"to": [12.3, 8, 12.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 8.25]},
            			"faces": {
            				"north": {"uv": [10.5, 4, 15, 4.5], "texture": "#2"},
            				"east": {"uv": [4, 11.5, 8, 12], "texture": "#2"},
            				"south": {"uv": [10.5, 4.5, 15, 5], "texture": "#2"},
            				"west": {"uv": [8, 11.5, 12, 12], "texture": "#2"},
            				"up": {"uv": [4.5, 4, 0, 0], "texture": "#2"},
            				"down": {"uv": [4.5, 4, 0, 8], "texture": "#2"}
            			}
            		},
            		{
            			"name": "seat",
            			"from": [3.7, 12.25, 4.25],
            			"to": [12.3, 16.5, 5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 14.375, 4.625]},
            			"faces": {
            				"north": {"uv": [4.5, 0, 9, 2], "texture": "#2"},
            				"east": {"uv": [10.5, 12.5, 11, 14.5], "texture": "#2"},
            				"south": {"uv": [4.5, 2, 9, 4], "texture": "#2"},
            				"west": {"uv": [11, 12.5, 11.5, 14.5], "texture": "#2"},
            				"up": {"uv": [15, 5.5, 10.5, 5], "texture": "#2"},
            				"down": {"uv": [15, 5.5, 10.5, 6], "texture": "#2"}
            			}
            		},
            		{
            			"name": "back",
            			"from": [3.75, 16, 3.5],
            			"to": [12.25, 17, 4.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 16.5, 3.875]},
            			"faces": {
            				"north": {"uv": [10.5, 6, 15, 6.5], "texture": "#2"},
            				"east": {"uv": [9, 3.5, 9.5, 4], "texture": "#2"},
            				"south": {"uv": [10.5, 6.5, 15, 7], "texture": "#2"},
            				"west": {"uv": [10, 3, 10.5, 3.5], "texture": "#2"},
            				"up": {"uv": [8.5, 11.5, 4, 11], "texture": "#2"},
            				"down": {"uv": [13, 11, 8.5, 11.5], "texture": "#2"}
            			}
            		},
            		{
            			"name": "back",
            			"from": [4.5, 7, 3.75],
            			"to": [5.5, 16, 4.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [5, 11.5, 4]},
            			"faces": {
            				"north": {"uv": [0, 11.5, 0.5, 16], "texture": "#2"},
            				"east": {"uv": [0.5, 11.5, 1, 16], "texture": "#2"},
            				"south": {"uv": [1, 11.5, 1.5, 16], "texture": "#2"},
            				"west": {"uv": [1.5, 11.5, 2, 16], "texture": "#2"},
            				"up": {"uv": [13.5, 11.5, 13, 11], "texture": "#2"},
            				"down": {"uv": [13.5, 12.5, 13, 13], "texture": "#2"}
            			}
            		},
            		{
            			"name": "back",
            			"from": [10.5, 7, 3.75],
            			"to": [11.5, 16, 4.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [11, 11.5, 4]},
            			"faces": {
            				"north": {"uv": [2, 11.5, 2.5, 16], "texture": "#2"},
            				"east": {"uv": [2.5, 11.5, 3, 16], "texture": "#2"},
            				"south": {"uv": [3, 11.5, 3.5, 16], "texture": "#2"},
            				"west": {"uv": [3.5, 11.5, 4, 16], "texture": "#2"},
            				"up": {"uv": [13.5, 13.5, 13, 13], "texture": "#2"},
            				"down": {"uv": [14, 0, 13.5, 0.5], "texture": "#2"}
            			}
            		},
            		{
            			"name": "support1",
            			"from": [4.35, 5.25, 5.25],
            			"to": [5.15, 7, 10.75],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4.75, 6.125, 8]},
            			"faces": {
            				"north": {"uv": [12.5, 10, 13, 11], "texture": "#2"},
            				"east": {"uv": [9.5, 7, 12.5, 8], "texture": "#2"},
            				"south": {"uv": [11.5, 12.5, 12, 13.5], "texture": "#2"},
            				"west": {"uv": [9.5, 8, 12.5, 9], "texture": "#2"},
            				"up": {"uv": [4.5, 11, 4, 8], "texture": "#2"},
            				"down": {"uv": [4.5, 12, 4, 15], "texture": "#2"}
            			}
            		},
            		{
            			"name": "support2",
            			"from": [10.85, 5.25, 5.25],
            			"to": [11.65, 7, 10.75],
            			"rotation": {"angle": 0, "axis": "y", "origin": [11.25, 6.125, 8]},
            			"faces": {
            				"north": {"uv": [12, 12.5, 12.5, 13.5], "texture": "#2"},
            				"east": {"uv": [9.5, 9, 12.5, 10], "texture": "#2"},
            				"south": {"uv": [12.5, 12.5, 13, 13.5], "texture": "#2"},
            				"west": {"uv": [10, 0, 13, 1], "texture": "#2"},
            				"up": {"uv": [5, 15, 4.5, 12], "texture": "#2"},
            				"down": {"uv": [5.5, 12, 5, 15], "texture": "#2"}
            			}
            		},
            		{
            			"name": "support3",
            			"from": [5.25, 5.25, 10.85],
            			"to": [10.75, 7, 11.65],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 6.125, 11.25]},
            			"faces": {
            				"north": {"uv": [10, 1, 13, 2], "texture": "#2"},
            				"east": {"uv": [13, 0, 13.5, 1], "texture": "#2"},
            				"south": {"uv": [10, 2, 13, 3], "texture": "#2"},
            				"west": {"uv": [13, 1, 13.5, 2], "texture": "#2"},
            				"up": {"uv": [8.5, 12.5, 5.5, 12], "texture": "#2"},
            				"down": {"uv": [11.5, 12, 8.5, 12.5], "texture": "#2"}
            			}
            		},
            		{
            			"name": "support4",
            			"from": [5.25, 5.25, 4.85],
            			"to": [10.75, 7, 5.65],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 6.125, 5.25]},
            			"faces": {
            				"north": {"uv": [9.5, 10, 12.5, 11], "texture": "#2"},
            				"east": {"uv": [13, 2, 13.5, 3], "texture": "#2"},
            				"south": {"uv": [10.5, 3, 13.5, 4], "texture": "#2"},
            				"west": {"uv": [13, 10, 13.5, 11], "texture": "#2"},
            				"up": {"uv": [14.5, 12.5, 11.5, 12], "texture": "#2"},
            				"down": {"uv": [15, 11.5, 12, 12], "texture": "#2"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_righthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_lefthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"ground": {
            			"translation": [0, 2.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [0, -0.25, 0],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"fixed": {
            			"rotation": [0, 90, 0],
            			"translation": [0, 0, 1],
            			"scale": [0.6, 0.6, 0.6]
            		}
            	},
            	"groups": [
            		{
            			"name": "chair_shape",
            			"origin": [4.25, 5, 7.75],
            			"color": 0,
            			"children": [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
            		}
            	]
            }
            """;

    public static final String SIMPLE_STOOL_NORMAL_CARPETED_MODEL_TEMPLATE = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [32, 32],
            	"textures": {
            		"1": "aestheticseating:block/simple_chair_COLOR_NAME_VALUE",
            		"2": "aestheticseating:block/simple_stool_WOOD_NAME_VALUE",
            		"particle": "aestheticseating:block/simple_stool_WOOD_NAME_VALUE"
            	},
            	"elements": [
            		{
            			"name": "leg1",
            			"from": [4, 0, 4],
            			"to": [5.5, 7, 5.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3.75, 0, 3.75]},
            			"faces": {
            				"north": {"uv": [4.5, 0, 5.5, 3.5], "texture": "#2"},
            				"east": {"uv": [4.5, 3.5, 5.5, 7], "texture": "#2"},
            				"south": {"uv": [5.5, 0, 6.5, 3.5], "texture": "#2"},
            				"west": {"uv": [5.5, 3.5, 6.5, 7], "texture": "#2"},
            				"up": {"uv": [2.5, 11, 1.5, 10], "texture": "#2"},
            				"down": {"uv": [3.5, 10, 2.5, 11], "texture": "#2"}
            			}
            		},
            		{
            			"name": "leg2",
            			"from": [4, 0, 10.5],
            			"to": [5.5, 7, 12],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3.75, 0, 10.25]},
            			"faces": {
            				"north": {"uv": [6.5, 0, 7.5, 3.5], "texture": "#2"},
            				"east": {"uv": [6.5, 3.5, 7.5, 7], "texture": "#2"},
            				"south": {"uv": [4.5, 7, 5.5, 10.5], "texture": "#2"},
            				"west": {"uv": [5.5, 7, 6.5, 10.5], "texture": "#2"},
            				"up": {"uv": [8, 11.5, 7, 10.5], "texture": "#2"},
            				"down": {"uv": [9, 10.5, 8, 11.5], "texture": "#2"}
            			}
            		},
            		{
            			"name": "leg3",
            			"from": [10.5, 0, 10.5],
            			"to": [12, 7, 12],
            			"rotation": {"angle": 0, "axis": "y", "origin": [10.25, 0, 10.25]},
            			"faces": {
            				"north": {"uv": [6.5, 7, 7.5, 10.5], "texture": "#2"},
            				"east": {"uv": [7.5, 0, 8.5, 3.5], "texture": "#2"},
            				"south": {"uv": [7.5, 3.5, 8.5, 7], "texture": "#2"},
            				"west": {"uv": [7.5, 7, 8.5, 10.5], "texture": "#2"},
            				"up": {"uv": [11, 11.5, 10, 10.5], "texture": "#2"},
            				"down": {"uv": [2.5, 11, 1.5, 12], "texture": "#2"}
            			}
            		},
            		{
            			"name": "leg4",
            			"from": [10.5, 0, 4],
            			"to": [12, 7, 5.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [10.25, 0, 3.75]},
            			"faces": {
            				"north": {"uv": [8.5, 0, 9.5, 3.5], "texture": "#2"},
            				"east": {"uv": [8.5, 3.5, 9.5, 7], "texture": "#2"},
            				"south": {"uv": [8.5, 7, 9.5, 10.5], "texture": "#2"},
            				"west": {"uv": [0, 9, 1, 12.5], "texture": "#2"},
            				"up": {"uv": [3.5, 12, 2.5, 11], "texture": "#2"},
            				"down": {"uv": [5.5, 11, 4.5, 12], "texture": "#2"}
            			}
            		},
            		{
            			"name": "seat",
            			"from": [3.45, 7, 3.5],
            			"to": [12.55, 8, 12.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3.25, 7, 2.5]},
            			"faces": {
            				"north": {"uv": [9.5, 7, 14, 7.5], "texture": "#2"},
            				"east": {"uv": [9.5, 7.5, 14, 8], "texture": "#2"},
            				"south": {"uv": [9.5, 8, 14, 8.5], "texture": "#2"},
            				"west": {"uv": [9.5, 8.5, 14, 9], "texture": "#2"},
            				"up": {"uv": [4.5, 4.5, 0, 0], "texture": "#2"},
            				"down": {"uv": [4.5, 4.5, 0, 9], "texture": "#2"}
            			}
            		},
            		{
            			"name": "support1",
            			"from": [4.35, 5.25, 5.5],
            			"to": [5.15, 7, 10.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3.5, 5, 9]},
            			"faces": {
            				"north": {"uv": [9, 10.5, 9.5, 11.5], "texture": "#2"},
            				"east": {"uv": [1, 9, 3.5, 10], "texture": "#2"},
            				"south": {"uv": [5.5, 11, 6, 12], "texture": "#2"},
            				"west": {"uv": [9.5, 0, 12, 1], "texture": "#2"},
            				"up": {"uv": [4, 11.5, 3.5, 9], "texture": "#2"},
            				"down": {"uv": [4.5, 9, 4, 11.5], "texture": "#2"}
            			}
            		},
            		{
            			"name": "support2",
            			"from": [10.85, 5.25, 5.5],
            			"to": [11.65, 7, 10.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [10, 5, 9]},
            			"faces": {
            				"north": {"uv": [6, 11, 6.5, 12], "texture": "#2"},
            				"east": {"uv": [9.5, 1, 12, 2], "texture": "#2"},
            				"south": {"uv": [6.5, 11, 7, 12], "texture": "#2"},
            				"west": {"uv": [9.5, 2, 12, 3], "texture": "#2"},
            				"up": {"uv": [10, 11.5, 9.5, 9], "texture": "#2"},
            				"down": {"uv": [1.5, 10, 1, 12.5], "texture": "#2"}
            			}
            		},
            		{
            			"name": "support3",
            			"from": [5.5, 5.25, 10.85],
            			"to": [10.5, 7, 11.65],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4.25, 5, 14.75]},
            			"faces": {
            				"north": {"uv": [9.5, 3, 12, 4], "texture": "#2"},
            				"east": {"uv": [11, 10.5, 11.5, 11.5], "texture": "#2"},
            				"south": {"uv": [9.5, 4, 12, 5], "texture": "#2"},
            				"west": {"uv": [3.5, 11.5, 4, 12.5], "texture": "#2"},
            				"up": {"uv": [12.5, 9.5, 10, 9], "texture": "#2"},
            				"down": {"uv": [12.5, 9.5, 10, 10], "texture": "#2"}
            			}
            		},
            		{
            			"name": "support4",
            			"from": [5.5, 5.25, 4.35],
            			"to": [10.5, 7, 5.15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4.25, 5, 8.25]},
            			"faces": {
            				"north": {"uv": [9.5, 5, 12, 6], "texture": "#2"},
            				"east": {"uv": [4, 11.5, 4.5, 12.5], "texture": "#2"},
            				"south": {"uv": [9.5, 6, 12, 7], "texture": "#2"},
            				"west": {"uv": [7, 11.5, 7.5, 12.5], "texture": "#2"},
            				"up": {"uv": [12.5, 10.5, 10, 10], "texture": "#2"},
            				"down": {"uv": [7, 10.5, 4.5, 11], "texture": "#2"}
            			}
            		},
            		{
            			"from": [3.75, 8, 3.75],
            			"to": [12.25, 8.5, 12.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4, 8, 4]},
            			"faces": {
            				"north": {"uv": [4.5, 0, 9, 0.5], "texture": "#1"},
            				"east": {"uv": [4.5, 0.5, 9, 1], "texture": "#1"},
            				"south": {"uv": [4.5, 1, 9, 1.5], "texture": "#1"},
            				"west": {"uv": [4.5, 1.5, 9, 2], "texture": "#1"},
            				"up": {"uv": [4.5, 4.5, 0, 0], "texture": "#1"},
            				"down": {"uv": [4.5, 4.5, 0, 9], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_righthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_lefthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"ground": {
            			"translation": [0, 2.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [0, -0.25, 0],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"fixed": {
            			"rotation": [0, 90, 0],
            			"translation": [0, 0, 1],
            			"scale": [0.6, 0.6, 0.6]
            		}
            	},
            	"groups": [
            		{
            			"name": "chair_shape",
            			"origin": [4.25, 5, 7.75],
            			"color": 0,
            			"children": [0, 1, 2, 3, 4, 5, 6, 7, 8]
            		},
            		{
            			"name": "carpet",
            			"origin": [8, 8, 8],
            			"color": 0,
            			"children": [9]
            		}
            	]
            }
            """;

    public static final String SIMPLE_STOOL_LATTICEBACK_CARPETED_MODEL_TEMPLATE = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [32, 32],
            	"textures": {
            		"1": "aestheticseating:block/simple_chair_COLOR_NAME_VALUE",
            		"2": "aestheticseating:block/latticeback_chair_WOOD_NAME_VALUE",
            		"particle": "aestheticseating:block/latticeback_chair_WOOD_NAME_VALUE"
            	},
            	"elements": [
            		{
            			"name": "leg1",
            			"from": [3.5, 0, 3.5],
            			"to": [5, 7, 5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 10, 7.75]},
            			"faces": {
            				"north": {"uv": [5, 0, 6, 3.5], "texture": "#2"},
            				"east": {"uv": [5, 3.5, 6, 7], "texture": "#2"},
            				"south": {"uv": [6, 0, 7, 3.5], "texture": "#2"},
            				"west": {"uv": [6, 3.5, 7, 7], "texture": "#2"},
            				"up": {"uv": [4, 10, 3, 9], "texture": "#2"},
            				"down": {"uv": [5, 9, 4, 10], "texture": "#2"}
            			}
            		},
            		{
            			"name": "leg2",
            			"from": [3.5, 0, 11],
            			"to": [5, 7, 12.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 10, 7.75]},
            			"faces": {
            				"north": {"uv": [7, 0, 8, 3.5], "texture": "#2"},
            				"east": {"uv": [7, 3.5, 8, 7], "texture": "#2"},
            				"south": {"uv": [5, 7, 6, 10.5], "texture": "#2"},
            				"west": {"uv": [6, 7, 7, 10.5], "texture": "#2"},
            				"up": {"uv": [3, 13.5, 2, 12.5], "texture": "#2"},
            				"down": {"uv": [13.5, 3.5, 12.5, 4.5], "texture": "#2"}
            			}
            		},
            		{
            			"name": "leg3",
            			"from": [11, 0, 11],
            			"to": [12.5, 7, 12.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 10, 7.75]},
            			"faces": {
            				"north": {"uv": [7, 7, 8, 10.5], "texture": "#2"},
            				"east": {"uv": [8, 0, 9, 3.5], "texture": "#2"},
            				"south": {"uv": [8, 3.5, 9, 7], "texture": "#2"},
            				"west": {"uv": [8, 7, 9, 10.5], "texture": "#2"},
            				"up": {"uv": [13.5, 5.5, 12.5, 4.5], "texture": "#2"},
            				"down": {"uv": [13.5, 5.5, 12.5, 6.5], "texture": "#2"}
            			}
            		},
            		{
            			"name": "leg4",
            			"from": [11, 0, 3.5],
            			"to": [12.5, 7, 5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 10, 7.75]},
            			"faces": {
            				"north": {"uv": [0, 9, 1, 12.5], "texture": "#2"},
            				"east": {"uv": [9, 0, 10, 3.5], "texture": "#2"},
            				"south": {"uv": [1, 9, 2, 12.5], "texture": "#2"},
            				"west": {"uv": [2, 9, 3, 12.5], "texture": "#2"},
            				"up": {"uv": [13.5, 7.5, 12.5, 6.5], "texture": "#2"},
            				"down": {"uv": [13.5, 10, 12.5, 11], "texture": "#2"}
            			}
            		},
            		{
            			"name": "seat",
            			"from": [3.2, 7, 4.25],
            			"to": [12.8, 8, 13],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 10, 7.75]},
            			"faces": {
            				"north": {"uv": [10, 1, 15, 1.5], "texture": "#2"},
            				"east": {"uv": [8, 10.5, 12.5, 11], "texture": "#2"},
            				"south": {"uv": [10, 1.5, 15, 2], "texture": "#2"},
            				"west": {"uv": [3, 11, 7.5, 11.5], "texture": "#2"},
            				"up": {"uv": [5, 4.5, 0, 0], "texture": "#2"},
            				"down": {"uv": [5, 4.5, 0, 9], "texture": "#2"}
            			}
            		},
            		{
            			"name": "back",
            			"from": [3.25, 16, 3.25],
            			"to": [12.75, 17, 4.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 10, 7.75]},
            			"faces": {
            				"north": {"uv": [10, 2, 15, 2.5], "texture": "#2"},
            				"east": {"uv": [3, 10, 3.5, 10.5], "texture": "#2"},
            				"south": {"uv": [10, 2.5, 15, 3], "texture": "#2"},
            				"west": {"uv": [3.5, 10, 4, 10.5], "texture": "#2"},
            				"up": {"uv": [15, 3.5, 10, 3], "texture": "#2"},
            				"down": {"uv": [8, 10.5, 3, 11], "texture": "#2"}
            			}
            		},
            		{
            			"name": "back",
            			"from": [3.5, 7, 3.25],
            			"to": [4.5, 16, 4.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 10, 7.75]},
            			"faces": {
            				"north": {"uv": [7.5, 11, 8, 15.5], "texture": "#2"},
            				"east": {"uv": [8, 11, 8.5, 15.5], "texture": "#2"},
            				"south": {"uv": [8.5, 11, 9, 15.5], "texture": "#2"},
            				"west": {"uv": [9, 11, 9.5, 15.5], "texture": "#2"},
            				"up": {"uv": [4.5, 10.5, 4, 10], "texture": "#2"},
            				"down": {"uv": [5, 10, 4.5, 10.5], "texture": "#2"}
            			}
            		},
            		{
            			"name": "back",
            			"from": [5.5, 7, 3.25],
            			"to": [6.5, 16, 4.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 10, 7.75]},
            			"faces": {
            				"north": {"uv": [9.5, 11, 10, 15.5], "texture": "#2"},
            				"east": {"uv": [10, 11, 10.5, 15.5], "texture": "#2"},
            				"south": {"uv": [10.5, 11, 11, 15.5], "texture": "#2"},
            				"west": {"uv": [11, 11, 11.5, 15.5], "texture": "#2"},
            				"up": {"uv": [12.5, 10.5, 12, 10], "texture": "#2"},
            				"down": {"uv": [13, 7.5, 12.5, 8], "texture": "#2"}
            			}
            		},
            		{
            			"name": "back",
            			"from": [7.5, 7, 3.25],
            			"to": [8.5, 16, 4.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 10, 7.75]},
            			"faces": {
            				"north": {"uv": [3, 11.5, 3.5, 16], "texture": "#2"},
            				"east": {"uv": [3.5, 11.5, 4, 16], "texture": "#2"},
            				"south": {"uv": [4, 11.5, 4.5, 16], "texture": "#2"},
            				"west": {"uv": [4.5, 11.5, 5, 16], "texture": "#2"},
            				"up": {"uv": [13.5, 8, 13, 7.5], "texture": "#2"},
            				"down": {"uv": [2.5, 13.5, 2, 14], "texture": "#2"}
            			}
            		},
            		{
            			"name": "back",
            			"from": [9.5, 7, 3.25],
            			"to": [10.5, 16, 4.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 10, 7.75]},
            			"faces": {
            				"north": {"uv": [5, 11.5, 5.5, 16], "texture": "#2"},
            				"east": {"uv": [5.5, 11.5, 6, 16], "texture": "#2"},
            				"south": {"uv": [6, 11.5, 6.5, 16], "texture": "#2"},
            				"west": {"uv": [6.5, 11.5, 7, 16], "texture": "#2"},
            				"up": {"uv": [3, 14, 2.5, 13.5], "texture": "#2"},
            				"down": {"uv": [14, 3.5, 13.5, 4], "texture": "#2"}
            			}
            		},
            		{
            			"name": "back",
            			"from": [11.5, 7, 3.25],
            			"to": [12.5, 16, 4.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 10, 7.75]},
            			"faces": {
            				"north": {"uv": [7, 11.5, 7.5, 16], "texture": "#2"},
            				"east": {"uv": [11.5, 11, 12, 15.5], "texture": "#2"},
            				"south": {"uv": [12, 3.5, 12.5, 8], "texture": "#2"},
            				"west": {"uv": [12, 11, 12.5, 15.5], "texture": "#2"},
            				"up": {"uv": [14, 4.5, 13.5, 4], "texture": "#2"},
            				"down": {"uv": [14, 4.5, 13.5, 5], "texture": "#2"}
            			}
            		},
            		{
            			"name": "support1",
            			"from": [3.85, 5.25, 5],
            			"to": [4.65, 7, 11],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 10, 7.75]},
            			"faces": {
            				"north": {"uv": [12.5, 11, 13, 12], "texture": "#2"},
            				"east": {"uv": [9, 3.5, 12, 4.5], "texture": "#2"},
            				"south": {"uv": [12.5, 12, 13, 13], "texture": "#2"},
            				"west": {"uv": [9, 4.5, 12, 5.5], "texture": "#2"},
            				"up": {"uv": [0.5, 15.5, 0, 12.5], "texture": "#2"},
            				"down": {"uv": [1, 12.5, 0.5, 15.5], "texture": "#2"}
            			}
            		},
            		{
            			"name": "support2",
            			"from": [11.35, 5.25, 5],
            			"to": [12.15, 7, 11],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 10, 7.75]},
            			"faces": {
            				"north": {"uv": [13, 0, 13.5, 1], "texture": "#2"},
            				"east": {"uv": [9, 5.5, 12, 6.5], "texture": "#2"},
            				"south": {"uv": [13, 11, 13.5, 12], "texture": "#2"},
            				"west": {"uv": [9, 6.5, 12, 7.5], "texture": "#2"},
            				"up": {"uv": [1.5, 15.5, 1, 12.5], "texture": "#2"},
            				"down": {"uv": [2, 12.5, 1.5, 15.5], "texture": "#2"}
            			}
            		},
            		{
            			"name": "support3",
            			"from": [5, 5.25, 11.35],
            			"to": [11, 7, 12.15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 10, 7.75]},
            			"faces": {
            				"north": {"uv": [9, 7.5, 12, 8.5], "texture": "#2"},
            				"east": {"uv": [13, 12, 13.5, 13], "texture": "#2"},
            				"south": {"uv": [9, 8.5, 12, 9.5], "texture": "#2"},
            				"west": {"uv": [12.5, 13, 13, 14], "texture": "#2"},
            				"up": {"uv": [15, 8.5, 12, 8], "texture": "#2"},
            				"down": {"uv": [15, 8.5, 12, 9], "texture": "#2"}
            			}
            		},
            		{
            			"name": "support4",
            			"from": [5, 5.25, 3.85],
            			"to": [11, 7, 4.65],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 10, 7.75]},
            			"faces": {
            				"north": {"uv": [9, 9.5, 12, 10.5], "texture": "#2"},
            				"east": {"uv": [13, 13, 13.5, 14], "texture": "#2"},
            				"south": {"uv": [10, 0, 13, 1], "texture": "#2"},
            				"west": {"uv": [13.5, 0, 14, 1], "texture": "#2"},
            				"up": {"uv": [15, 9.5, 12, 9], "texture": "#2"},
            				"down": {"uv": [15, 9.5, 12, 10], "texture": "#2"}
            			}
            		},
            		{
            			"from": [3.5, 8, 4.5],
            			"to": [12.5, 8.5, 12.75],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4, 8, 4.75]},
            			"faces": {
            				"north": {"uv": [4.5, 0, 9, 0.5], "texture": "#1"},
            				"east": {"uv": [4.5, 0.5, 9, 1], "texture": "#1"},
            				"south": {"uv": [4.5, 1, 9, 1.5], "texture": "#1"},
            				"west": {"uv": [4.5, 1.5, 9, 2], "texture": "#1"},
            				"up": {"uv": [4.5, 4.5, 0, 0], "texture": "#1"},
            				"down": {"uv": [4.5, 4.5, 0, 9], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_righthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_lefthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"ground": {
            			"translation": [0, 2.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [0, -0.25, 0],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"fixed": {
            			"rotation": [0, 90, 0],
            			"translation": [0, 0, 1],
            			"scale": [0.6, 0.6, 0.6]
            		}
            	},
            	"groups": [
            		{
            			"name": "chair_shape",
            			"origin": [4.25, 5, 7.75],
            			"color": 0,
            			"children": [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]
            		},
            		{
            			"name": "carpet",
            			"origin": [8, 8, 8],
            			"color": 0,
            			"children": [15]
            		}
            	]
            }
            """;

    public static final String SIMPLE_STOOL_DESK_CARPETED_MODEL_TEMPLATE = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [32, 32],
            	"textures": {
            		"1": "aestheticseating:block/simple_chair_COLOR_NAME_VALUE",
            		"2": "aestheticseating:block/desk_chair_WOOD_NAME_VALUE",
            		"particle": "aestheticseating:block/desk_chair_WOOD_NAME_VALUE"
            	},
            	"elements": [
            		{
            			"name": "leg1",
            			"from": [4, 0, 4.5],
            			"to": [5.5, 7, 6],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4.75, 3.5, 5.25]},
            			"faces": {
            				"north": {"uv": [4.5, 4, 5.5, 7.5], "texture": "#2"},
            				"east": {"uv": [5.5, 4, 6.5, 7.5], "texture": "#2"},
            				"south": {"uv": [6.5, 4, 7.5, 7.5], "texture": "#2"},
            				"west": {"uv": [7.5, 4, 8.5, 7.5], "texture": "#2"},
            				"up": {"uv": [6.5, 13.5, 5.5, 12.5], "texture": "#2"},
            				"down": {"uv": [7.5, 12.5, 6.5, 13.5], "texture": "#2"}
            			}
            		},
            		{
            			"name": "leg2",
            			"from": [4, 0, 10.5],
            			"to": [5.5, 7, 12],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4.75, 3.5, 11.25]},
            			"faces": {
            				"north": {"uv": [4.5, 7.5, 5.5, 11], "texture": "#2"},
            				"east": {"uv": [5.5, 7.5, 6.5, 11], "texture": "#2"},
            				"south": {"uv": [6.5, 7.5, 7.5, 11], "texture": "#2"},
            				"west": {"uv": [7.5, 7.5, 8.5, 11], "texture": "#2"},
            				"up": {"uv": [13.5, 8, 12.5, 7], "texture": "#2"},
            				"down": {"uv": [8.5, 12.5, 7.5, 13.5], "texture": "#2"}
            			}
            		},
            		{
            			"name": "leg3",
            			"from": [10.5, 0, 10.5],
            			"to": [12, 7, 12],
            			"rotation": {"angle": 0, "axis": "y", "origin": [11.25, 3.5, 11.25]},
            			"faces": {
            				"north": {"uv": [0, 8, 1, 11.5], "texture": "#2"},
            				"east": {"uv": [1, 8, 2, 11.5], "texture": "#2"},
            				"south": {"uv": [2, 8, 3, 11.5], "texture": "#2"},
            				"west": {"uv": [3, 8, 4, 11.5], "texture": "#2"},
            				"up": {"uv": [13.5, 9, 12.5, 8], "texture": "#2"},
            				"down": {"uv": [9.5, 12.5, 8.5, 13.5], "texture": "#2"}
            			}
            		},
            		{
            			"name": "leg4",
            			"from": [10.5, 0, 4.5],
            			"to": [12, 7, 6],
            			"rotation": {"angle": 0, "axis": "y", "origin": [11.25, 3.5, 5.25]},
            			"faces": {
            				"north": {"uv": [8.5, 4, 9.5, 7.5], "texture": "#2"},
            				"east": {"uv": [8.5, 7.5, 9.5, 11], "texture": "#2"},
            				"south": {"uv": [9, 0, 10, 3.5], "texture": "#2"},
            				"west": {"uv": [9.5, 3.5, 10.5, 7], "texture": "#2"},
            				"up": {"uv": [13.5, 10, 12.5, 9], "texture": "#2"},
            				"down": {"uv": [10.5, 12.5, 9.5, 13.5], "texture": "#2"}
            			}
            		},
            		{
            			"name": "seat",
            			"from": [3.7, 7, 4.25],
            			"to": [12.3, 8, 12.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 7.5, 8.25]},
            			"faces": {
            				"north": {"uv": [10.5, 4, 15, 4.5], "texture": "#2"},
            				"east": {"uv": [4, 11.5, 8, 12], "texture": "#2"},
            				"south": {"uv": [10.5, 4.5, 15, 5], "texture": "#2"},
            				"west": {"uv": [8, 11.5, 12, 12], "texture": "#2"},
            				"up": {"uv": [4.5, 4, 0, 0], "texture": "#2"},
            				"down": {"uv": [4.5, 4, 0, 8], "texture": "#2"}
            			}
            		},
            		{
            			"name": "seat",
            			"from": [3.7, 12.25, 4.25],
            			"to": [12.3, 16.5, 5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 14.375, 4.625]},
            			"faces": {
            				"north": {"uv": [4.5, 0, 9, 2], "texture": "#2"},
            				"east": {"uv": [10.5, 12.5, 11, 14.5], "texture": "#2"},
            				"south": {"uv": [4.5, 2, 9, 4], "texture": "#2"},
            				"west": {"uv": [11, 12.5, 11.5, 14.5], "texture": "#2"},
            				"up": {"uv": [15, 5.5, 10.5, 5], "texture": "#2"},
            				"down": {"uv": [15, 5.5, 10.5, 6], "texture": "#2"}
            			}
            		},
            		{
            			"name": "back",
            			"from": [3.75, 16, 3.5],
            			"to": [12.25, 17, 4.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 16.5, 3.875]},
            			"faces": {
            				"north": {"uv": [10.5, 6, 15, 6.5], "texture": "#2"},
            				"east": {"uv": [9, 3.5, 9.5, 4], "texture": "#2"},
            				"south": {"uv": [10.5, 6.5, 15, 7], "texture": "#2"},
            				"west": {"uv": [10, 3, 10.5, 3.5], "texture": "#2"},
            				"up": {"uv": [8.5, 11.5, 4, 11], "texture": "#2"},
            				"down": {"uv": [13, 11, 8.5, 11.5], "texture": "#2"}
            			}
            		},
            		{
            			"name": "back",
            			"from": [4.5, 7, 3.75],
            			"to": [5.5, 16, 4.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [5, 11.5, 4]},
            			"faces": {
            				"north": {"uv": [0, 11.5, 0.5, 16], "texture": "#2"},
            				"east": {"uv": [0.5, 11.5, 1, 16], "texture": "#2"},
            				"south": {"uv": [1, 11.5, 1.5, 16], "texture": "#2"},
            				"west": {"uv": [1.5, 11.5, 2, 16], "texture": "#2"},
            				"up": {"uv": [13.5, 11.5, 13, 11], "texture": "#2"},
            				"down": {"uv": [13.5, 12.5, 13, 13], "texture": "#2"}
            			}
            		},
            		{
            			"name": "back",
            			"from": [10.5, 7, 3.75],
            			"to": [11.5, 16, 4.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [11, 11.5, 4]},
            			"faces": {
            				"north": {"uv": [2, 11.5, 2.5, 16], "texture": "#2"},
            				"east": {"uv": [2.5, 11.5, 3, 16], "texture": "#2"},
            				"south": {"uv": [3, 11.5, 3.5, 16], "texture": "#2"},
            				"west": {"uv": [3.5, 11.5, 4, 16], "texture": "#2"},
            				"up": {"uv": [13.5, 13.5, 13, 13], "texture": "#2"},
            				"down": {"uv": [14, 0, 13.5, 0.5], "texture": "#2"}
            			}
            		},
            		{
            			"name": "support1",
            			"from": [4.35, 5.25, 5.25],
            			"to": [5.15, 7, 10.75],
            			"rotation": {"angle": 0, "axis": "y", "origin": [4.75, 6.125, 8]},
            			"faces": {
            				"north": {"uv": [12.5, 10, 13, 11], "texture": "#2"},
            				"east": {"uv": [9.5, 7, 12.5, 8], "texture": "#2"},
            				"south": {"uv": [11.5, 12.5, 12, 13.5], "texture": "#2"},
            				"west": {"uv": [9.5, 8, 12.5, 9], "texture": "#2"},
            				"up": {"uv": [4.5, 11, 4, 8], "texture": "#2"},
            				"down": {"uv": [4.5, 12, 4, 15], "texture": "#2"}
            			}
            		},
            		{
            			"name": "support2",
            			"from": [10.85, 5.25, 5.25],
            			"to": [11.65, 7, 10.75],
            			"rotation": {"angle": 0, "axis": "y", "origin": [11.25, 6.125, 8]},
            			"faces": {
            				"north": {"uv": [12, 12.5, 12.5, 13.5], "texture": "#2"},
            				"east": {"uv": [9.5, 9, 12.5, 10], "texture": "#2"},
            				"south": {"uv": [12.5, 12.5, 13, 13.5], "texture": "#2"},
            				"west": {"uv": [10, 0, 13, 1], "texture": "#2"},
            				"up": {"uv": [5, 15, 4.5, 12], "texture": "#2"},
            				"down": {"uv": [5.5, 12, 5, 15], "texture": "#2"}
            			}
            		},
            		{
            			"name": "support3",
            			"from": [5.25, 5.25, 10.85],
            			"to": [10.75, 7, 11.65],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 6.125, 11.25]},
            			"faces": {
            				"north": {"uv": [10, 1, 13, 2], "texture": "#2"},
            				"east": {"uv": [13, 0, 13.5, 1], "texture": "#2"},
            				"south": {"uv": [10, 2, 13, 3], "texture": "#2"},
            				"west": {"uv": [13, 1, 13.5, 2], "texture": "#2"},
            				"up": {"uv": [8.5, 12.5, 5.5, 12], "texture": "#2"},
            				"down": {"uv": [11.5, 12, 8.5, 12.5], "texture": "#2"}
            			}
            		},
            		{
            			"name": "support4",
            			"from": [5.25, 5.25, 4.85],
            			"to": [10.75, 7, 5.65],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 6.125, 5.25]},
            			"faces": {
            				"north": {"uv": [9.5, 10, 12.5, 11], "texture": "#2"},
            				"east": {"uv": [13, 2, 13.5, 3], "texture": "#2"},
            				"south": {"uv": [10.5, 3, 13.5, 4], "texture": "#2"},
            				"west": {"uv": [13, 10, 13.5, 11], "texture": "#2"},
            				"up": {"uv": [14.5, 12.5, 11.5, 12], "texture": "#2"},
            				"down": {"uv": [15, 11.5, 12, 12], "texture": "#2"}
            			}
            		},
            		{
            			"from": [4, 8, 4.5],
            			"to": [12, 8.3, 12],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.15, 8.375]},
            			"faces": {
            				"north": {"uv": [4.5, 0, 9, 0.5], "texture": "#1"},
            				"east": {"uv": [4.5, 0.5, 9, 1], "texture": "#1"},
            				"south": {"uv": [4.5, 1, 9, 1.5], "texture": "#1"},
            				"west": {"uv": [4.5, 1.5, 9, 2], "texture": "#1"},
            				"up": {"uv": [4.5, 4.5, 0, 0], "texture": "#1"},
            				"down": {"uv": [4.5, 4.5, 0, 9], "texture": "#1"}
            			}
            		},
            		{
            			"from": [4, 12.5, 5],
            			"to": [12, 16.15, 5.2],
            			"rotation": {"angle": 0, "axis": "x", "origin": [8, 14.325, 5.1]},
            			"faces": {
            				"north": {"uv": [4.5, 4.5, 0, 9], "rotation": 180, "texture": "#1"},
            				"east": {"uv": [4.5, 0.5, 9, 1], "rotation": 270, "texture": "#1"},
            				"south": {"uv": [4.5, 4.5, 0, 0], "texture": "#1"},
            				"west": {"uv": [4.5, 1.5, 9, 2], "rotation": 90, "texture": "#1"},
            				"up": {"uv": [4.5, 0, 9, 0.5], "rotation": 180, "texture": "#1"},
            				"down": {"uv": [4.5, 1, 9, 1.5], "texture": "#1"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_righthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_lefthand": {
            			"translation": [1.75, 2.5, -1.25],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"ground": {
            			"translation": [0, 2.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [0, -0.25, 0],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"fixed": {
            			"rotation": [0, 90, 0],
            			"translation": [0, 0, 1],
            			"scale": [0.6, 0.6, 0.6]
            		}
            	},
            	"groups": [
            		{
            			"name": "chair_shape",
            			"origin": [4.25, 5, 7.75],
            			"color": 0,
            			"children": [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
            		},
            		{
            			"name": "carpet",
            			"origin": [8, 8, 8],
            			"color": 0,
            			"children": [13, 14]
            		}
            	]
            }
            """;

    public static final String SIMPLE_STOOL_BLOCKSTATE_TEMPLATE = """
            {
              "variants":
              {
                "facing=north,form=normal,carpeted=false,carpet_color=black": { "model": "aestheticseating:block/black/simple_stool_normal_WOOD_NAME_VALUE" },
                "facing=south,form=normal,carpeted=false,carpet_color=black": { "model": "aestheticseating:block/black/simple_stool_normal_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=normal,carpeted=false,carpet_color=black": { "model": "aestheticseating:block/black/simple_stool_normal_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=normal,carpeted=false,carpet_color=black": { "model": "aestheticseating:block/black/simple_stool_normal_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=normal,carpeted=true,carpet_color=black": { "model": "aestheticseating:block/black/simple_stool_normal_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=normal,carpeted=true,carpet_color=black": { "model": "aestheticseating:block/black/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=normal,carpeted=true,carpet_color=black": { "model": "aestheticseating:block/black/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=normal,carpeted=true,carpet_color=black": { "model": "aestheticseating:block/black/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,form=latticeback,carpeted=false,carpet_color=black": { "model": "aestheticseating:block/black/simple_stool_latticeback_WOOD_NAME_VALUE" },
                "facing=south,form=latticeback,carpeted=false,carpet_color=black": { "model": "aestheticseating:block/black/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=latticeback,carpeted=false,carpet_color=black": { "model": "aestheticseating:block/black/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=latticeback,carpeted=false,carpet_color=black": { "model": "aestheticseating:block/black/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=latticeback,carpeted=true,carpet_color=black": { "model": "aestheticseating:block/black/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=latticeback,carpeted=true,carpet_color=black": { "model": "aestheticseating:block/black/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=latticeback,carpeted=true,carpet_color=black": { "model": "aestheticseating:block/black/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=latticeback,carpeted=true,carpet_color=black": { "model": "aestheticseating:block/black/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,form=desk,carpeted=false,carpet_color=black": { "model": "aestheticseating:block/black/simple_stool_desk_WOOD_NAME_VALUE" },
                "facing=south,form=desk,carpeted=false,carpet_color=black": { "model": "aestheticseating:block/black/simple_stool_desk_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=desk,carpeted=false,carpet_color=black": { "model": "aestheticseating:block/black/simple_stool_desk_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=desk,carpeted=false,carpet_color=black": { "model": "aestheticseating:block/black/simple_stool_desk_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=desk,carpeted=true,carpet_color=black": { "model": "aestheticseating:block/black/simple_stool_desk_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=desk,carpeted=true,carpet_color=black": { "model": "aestheticseating:block/black/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=desk,carpeted=true,carpet_color=black": { "model": "aestheticseating:block/black/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=desk,carpeted=true,carpet_color=black": { "model": "aestheticseating:block/black/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 90 },
                
                "facing=north,form=normal,carpeted=false,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_stool_normal_WOOD_NAME_VALUE" },
                "facing=south,form=normal,carpeted=false,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_stool_normal_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=normal,carpeted=false,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_stool_normal_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=normal,carpeted=false,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_stool_normal_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=normal,carpeted=true,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_stool_normal_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=normal,carpeted=true,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=normal,carpeted=true,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=normal,carpeted=true,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,form=latticeback,carpeted=false,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_stool_latticeback_WOOD_NAME_VALUE" },
                "facing=south,form=latticeback,carpeted=false,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=latticeback,carpeted=false,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=latticeback,carpeted=false,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=latticeback,carpeted=true,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=latticeback,carpeted=true,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=latticeback,carpeted=true,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=latticeback,carpeted=true,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,form=desk,carpeted=false,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_stool_desk_WOOD_NAME_VALUE" },
                "facing=south,form=desk,carpeted=false,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_stool_desk_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=desk,carpeted=false,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_stool_desk_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=desk,carpeted=false,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_stool_desk_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=desk,carpeted=true,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_stool_desk_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=desk,carpeted=true,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=desk,carpeted=true,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=desk,carpeted=true,carpet_color=brown": { "model": "aestheticseating:block/brown/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 90 },
                
                "facing=north,form=normal,carpeted=false,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_stool_normal_WOOD_NAME_VALUE" },
                "facing=south,form=normal,carpeted=false,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_stool_normal_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=normal,carpeted=false,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_stool_normal_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=normal,carpeted=false,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_stool_normal_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=normal,carpeted=true,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_stool_normal_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=normal,carpeted=true,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=normal,carpeted=true,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=normal,carpeted=true,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,form=latticeback,carpeted=false,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_stool_latticeback_WOOD_NAME_VALUE" },
                "facing=south,form=latticeback,carpeted=false,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=latticeback,carpeted=false,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=latticeback,carpeted=false,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=latticeback,carpeted=true,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=latticeback,carpeted=true,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=latticeback,carpeted=true,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=latticeback,carpeted=true,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,form=desk,carpeted=false,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_stool_desk_WOOD_NAME_VALUE" },
                "facing=south,form=desk,carpeted=false,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_stool_desk_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=desk,carpeted=false,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_stool_desk_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=desk,carpeted=false,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_stool_desk_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=desk,carpeted=true,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_stool_desk_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=desk,carpeted=true,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=desk,carpeted=true,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=desk,carpeted=true,carpet_color=gray": { "model": "aestheticseating:block/gray/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 90 },
                
                "facing=north,form=normal,carpeted=false,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_stool_normal_WOOD_NAME_VALUE" },
                "facing=south,form=normal,carpeted=false,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_stool_normal_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=normal,carpeted=false,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_stool_normal_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=normal,carpeted=false,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_stool_normal_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=normal,carpeted=true,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_stool_normal_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=normal,carpeted=true,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=normal,carpeted=true,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=normal,carpeted=true,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,form=latticeback,carpeted=false,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_stool_latticeback_WOOD_NAME_VALUE" },
                "facing=south,form=latticeback,carpeted=false,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=latticeback,carpeted=false,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=latticeback,carpeted=false,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=latticeback,carpeted=true,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=latticeback,carpeted=true,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=latticeback,carpeted=true,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=latticeback,carpeted=true,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,form=desk,carpeted=false,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_stool_desk_WOOD_NAME_VALUE" },
                "facing=south,form=desk,carpeted=false,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_stool_desk_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=desk,carpeted=false,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_stool_desk_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=desk,carpeted=false,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_stool_desk_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=desk,carpeted=true,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_stool_desk_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=desk,carpeted=true,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=desk,carpeted=true,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=desk,carpeted=true,carpet_color=light_gray": { "model": "aestheticseating:block/light_gray/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 90 },
                
                "facing=north,form=normal,carpeted=false,carpet_color=white": { "model": "aestheticseating:block/white/simple_stool_normal_WOOD_NAME_VALUE" },
                "facing=south,form=normal,carpeted=false,carpet_color=white": { "model": "aestheticseating:block/white/simple_stool_normal_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=normal,carpeted=false,carpet_color=white": { "model": "aestheticseating:block/white/simple_stool_normal_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=normal,carpeted=false,carpet_color=white": { "model": "aestheticseating:block/white/simple_stool_normal_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=normal,carpeted=true,carpet_color=white": { "model": "aestheticseating:block/white/simple_stool_normal_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=normal,carpeted=true,carpet_color=white": { "model": "aestheticseating:block/white/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=normal,carpeted=true,carpet_color=white": { "model": "aestheticseating:block/white/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=normal,carpeted=true,carpet_color=white": { "model": "aestheticseating:block/white/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,form=latticeback,carpeted=false,carpet_color=white": { "model": "aestheticseating:block/white/simple_stool_latticeback_WOOD_NAME_VALUE" },
                "facing=south,form=latticeback,carpeted=false,carpet_color=white": { "model": "aestheticseating:block/white/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=latticeback,carpeted=false,carpet_color=white": { "model": "aestheticseating:block/white/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=latticeback,carpeted=false,carpet_color=white": { "model": "aestheticseating:block/white/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=latticeback,carpeted=true,carpet_color=white": { "model": "aestheticseating:block/white/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=latticeback,carpeted=true,carpet_color=white": { "model": "aestheticseating:block/white/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=latticeback,carpeted=true,carpet_color=white": { "model": "aestheticseating:block/white/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=latticeback,carpeted=true,carpet_color=white": { "model": "aestheticseating:block/white/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,form=desk,carpeted=false,carpet_color=white": { "model": "aestheticseating:block/white/simple_stool_desk_WOOD_NAME_VALUE" },
                "facing=south,form=desk,carpeted=false,carpet_color=white": { "model": "aestheticseating:block/white/simple_stool_desk_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=desk,carpeted=false,carpet_color=white": { "model": "aestheticseating:block/white/simple_stool_desk_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=desk,carpeted=false,carpet_color=white": { "model": "aestheticseating:block/white/simple_stool_desk_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=desk,carpeted=true,carpet_color=white": { "model": "aestheticseating:block/white/simple_stool_desk_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=desk,carpeted=true,carpet_color=white": { "model": "aestheticseating:block/white/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=desk,carpeted=true,carpet_color=white": { "model": "aestheticseating:block/white/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=desk,carpeted=true,carpet_color=white": { "model": "aestheticseating:block/white/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 90 },
                
                "facing=north,form=normal,carpeted=false,carpet_color=red": { "model": "aestheticseating:block/red/simple_stool_normal_WOOD_NAME_VALUE" },
                "facing=south,form=normal,carpeted=false,carpet_color=red": { "model": "aestheticseating:block/red/simple_stool_normal_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=normal,carpeted=false,carpet_color=red": { "model": "aestheticseating:block/red/simple_stool_normal_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=normal,carpeted=false,carpet_color=red": { "model": "aestheticseating:block/red/simple_stool_normal_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=normal,carpeted=true,carpet_color=red": { "model": "aestheticseating:block/red/simple_stool_normal_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=normal,carpeted=true,carpet_color=red": { "model": "aestheticseating:block/red/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=normal,carpeted=true,carpet_color=red": { "model": "aestheticseating:block/red/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=normal,carpeted=true,carpet_color=red": { "model": "aestheticseating:block/red/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,form=latticeback,carpeted=false,carpet_color=red": { "model": "aestheticseating:block/red/simple_stool_latticeback_WOOD_NAME_VALUE" },
                "facing=south,form=latticeback,carpeted=false,carpet_color=red": { "model": "aestheticseating:block/red/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=latticeback,carpeted=false,carpet_color=red": { "model": "aestheticseating:block/red/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=latticeback,carpeted=false,carpet_color=red": { "model": "aestheticseating:block/red/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=latticeback,carpeted=true,carpet_color=red": { "model": "aestheticseating:block/red/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=latticeback,carpeted=true,carpet_color=red": { "model": "aestheticseating:block/red/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=latticeback,carpeted=true,carpet_color=red": { "model": "aestheticseating:block/red/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=latticeback,carpeted=true,carpet_color=red": { "model": "aestheticseating:block/red/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,form=desk,carpeted=false,carpet_color=red": { "model": "aestheticseating:block/red/simple_stool_desk_WOOD_NAME_VALUE" },
                "facing=south,form=desk,carpeted=false,carpet_color=red": { "model": "aestheticseating:block/red/simple_stool_desk_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=desk,carpeted=false,carpet_color=red": { "model": "aestheticseating:block/red/simple_stool_desk_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=desk,carpeted=false,carpet_color=red": { "model": "aestheticseating:block/red/simple_stool_desk_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=desk,carpeted=true,carpet_color=red": { "model": "aestheticseating:block/red/simple_stool_desk_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=desk,carpeted=true,carpet_color=red": { "model": "aestheticseating:block/red/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=desk,carpeted=true,carpet_color=red": { "model": "aestheticseating:block/red/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=desk,carpeted=true,carpet_color=red": { "model": "aestheticseating:block/red/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 90 },
                
                "facing=north,form=normal,carpeted=false,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_stool_normal_WOOD_NAME_VALUE" },
                "facing=south,form=normal,carpeted=false,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_stool_normal_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=normal,carpeted=false,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_stool_normal_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=normal,carpeted=false,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_stool_normal_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=normal,carpeted=true,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_stool_normal_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=normal,carpeted=true,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=normal,carpeted=true,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=normal,carpeted=true,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,form=latticeback,carpeted=false,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_stool_latticeback_WOOD_NAME_VALUE" },
                "facing=south,form=latticeback,carpeted=false,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=latticeback,carpeted=false,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=latticeback,carpeted=false,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=latticeback,carpeted=true,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=latticeback,carpeted=true,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=latticeback,carpeted=true,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=latticeback,carpeted=true,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,form=desk,carpeted=false,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_stool_desk_WOOD_NAME_VALUE" },
                "facing=south,form=desk,carpeted=false,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_stool_desk_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=desk,carpeted=false,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_stool_desk_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=desk,carpeted=false,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_stool_desk_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=desk,carpeted=true,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_stool_desk_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=desk,carpeted=true,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=desk,carpeted=true,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=desk,carpeted=true,carpet_color=orange": { "model": "aestheticseating:block/orange/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 90 },
                
                "facing=north,form=normal,carpeted=false,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_stool_normal_WOOD_NAME_VALUE" },
                "facing=south,form=normal,carpeted=false,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_stool_normal_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=normal,carpeted=false,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_stool_normal_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=normal,carpeted=false,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_stool_normal_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=normal,carpeted=true,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_stool_normal_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=normal,carpeted=true,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=normal,carpeted=true,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=normal,carpeted=true,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,form=latticeback,carpeted=false,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_stool_latticeback_WOOD_NAME_VALUE" },
                "facing=south,form=latticeback,carpeted=false,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=latticeback,carpeted=false,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=latticeback,carpeted=false,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=latticeback,carpeted=true,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=latticeback,carpeted=true,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=latticeback,carpeted=true,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=latticeback,carpeted=true,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,form=desk,carpeted=false,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_stool_desk_WOOD_NAME_VALUE" },
                "facing=south,form=desk,carpeted=false,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_stool_desk_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=desk,carpeted=false,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_stool_desk_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=desk,carpeted=false,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_stool_desk_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=desk,carpeted=true,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_stool_desk_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=desk,carpeted=true,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=desk,carpeted=true,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=desk,carpeted=true,carpet_color=yellow": { "model": "aestheticseating:block/yellow/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 90 },
                
                "facing=north,form=normal,carpeted=false,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_stool_normal_WOOD_NAME_VALUE" },
                "facing=south,form=normal,carpeted=false,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_stool_normal_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=normal,carpeted=false,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_stool_normal_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=normal,carpeted=false,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_stool_normal_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=normal,carpeted=true,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_stool_normal_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=normal,carpeted=true,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=normal,carpeted=true,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=normal,carpeted=true,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,form=latticeback,carpeted=false,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_stool_latticeback_WOOD_NAME_VALUE" },
                "facing=south,form=latticeback,carpeted=false,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=latticeback,carpeted=false,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=latticeback,carpeted=false,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=latticeback,carpeted=true,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=latticeback,carpeted=true,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=latticeback,carpeted=true,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=latticeback,carpeted=true,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,form=desk,carpeted=false,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_stool_desk_WOOD_NAME_VALUE" },
                "facing=south,form=desk,carpeted=false,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_stool_desk_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=desk,carpeted=false,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_stool_desk_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=desk,carpeted=false,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_stool_desk_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=desk,carpeted=true,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_stool_desk_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=desk,carpeted=true,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=desk,carpeted=true,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=desk,carpeted=true,carpet_color=purple": { "model": "aestheticseating:block/purple/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 90 },
                
                "facing=north,form=normal,carpeted=false,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_stool_normal_WOOD_NAME_VALUE" },
                "facing=south,form=normal,carpeted=false,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_stool_normal_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=normal,carpeted=false,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_stool_normal_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=normal,carpeted=false,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_stool_normal_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=normal,carpeted=true,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_stool_normal_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=normal,carpeted=true,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=normal,carpeted=true,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=normal,carpeted=true,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,form=latticeback,carpeted=false,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_stool_latticeback_WOOD_NAME_VALUE" },
                "facing=south,form=latticeback,carpeted=false,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=latticeback,carpeted=false,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=latticeback,carpeted=false,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=latticeback,carpeted=true,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=latticeback,carpeted=true,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=latticeback,carpeted=true,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=latticeback,carpeted=true,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,form=desk,carpeted=false,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_stool_desk_WOOD_NAME_VALUE" },
                "facing=south,form=desk,carpeted=false,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_stool_desk_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=desk,carpeted=false,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_stool_desk_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=desk,carpeted=false,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_stool_desk_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=desk,carpeted=true,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_stool_desk_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=desk,carpeted=true,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=desk,carpeted=true,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=desk,carpeted=true,carpet_color=magenta": { "model": "aestheticseating:block/magenta/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 90 },
                
                "facing=north,form=normal,carpeted=false,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_stool_normal_WOOD_NAME_VALUE" },
                "facing=south,form=normal,carpeted=false,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_stool_normal_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=normal,carpeted=false,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_stool_normal_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=normal,carpeted=false,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_stool_normal_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=normal,carpeted=true,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_stool_normal_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=normal,carpeted=true,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=normal,carpeted=true,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=normal,carpeted=true,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,form=latticeback,carpeted=false,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_stool_latticeback_WOOD_NAME_VALUE" },
                "facing=south,form=latticeback,carpeted=false,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=latticeback,carpeted=false,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=latticeback,carpeted=false,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=latticeback,carpeted=true,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=latticeback,carpeted=true,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=latticeback,carpeted=true,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=latticeback,carpeted=true,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,form=desk,carpeted=false,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_stool_desk_WOOD_NAME_VALUE" },
                "facing=south,form=desk,carpeted=false,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_stool_desk_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=desk,carpeted=false,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_stool_desk_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=desk,carpeted=false,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_stool_desk_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=desk,carpeted=true,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_stool_desk_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=desk,carpeted=true,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=desk,carpeted=true,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=desk,carpeted=true,carpet_color=pink": { "model": "aestheticseating:block/pink/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 90 },
                
                "facing=north,form=normal,carpeted=false,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_stool_normal_WOOD_NAME_VALUE" },
                "facing=south,form=normal,carpeted=false,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_stool_normal_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=normal,carpeted=false,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_stool_normal_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=normal,carpeted=false,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_stool_normal_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=normal,carpeted=true,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_stool_normal_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=normal,carpeted=true,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=normal,carpeted=true,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=normal,carpeted=true,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,form=latticeback,carpeted=false,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_stool_latticeback_WOOD_NAME_VALUE" },
                "facing=south,form=latticeback,carpeted=false,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=latticeback,carpeted=false,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=latticeback,carpeted=false,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=latticeback,carpeted=true,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=latticeback,carpeted=true,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=latticeback,carpeted=true,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=latticeback,carpeted=true,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,form=desk,carpeted=false,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_stool_desk_WOOD_NAME_VALUE" },
                "facing=south,form=desk,carpeted=false,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_stool_desk_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=desk,carpeted=false,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_stool_desk_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=desk,carpeted=false,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_stool_desk_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=desk,carpeted=true,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_stool_desk_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=desk,carpeted=true,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=desk,carpeted=true,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=desk,carpeted=true,carpet_color=blue": { "model": "aestheticseating:block/blue/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 90 },
                
                "facing=north,form=normal,carpeted=false,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_stool_normal_WOOD_NAME_VALUE" },
                "facing=south,form=normal,carpeted=false,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_stool_normal_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=normal,carpeted=false,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_stool_normal_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=normal,carpeted=false,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_stool_normal_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=normal,carpeted=true,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_stool_normal_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=normal,carpeted=true,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=normal,carpeted=true,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=normal,carpeted=true,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,form=latticeback,carpeted=false,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_stool_latticeback_WOOD_NAME_VALUE" },
                "facing=south,form=latticeback,carpeted=false,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=latticeback,carpeted=false,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=latticeback,carpeted=false,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=latticeback,carpeted=true,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=latticeback,carpeted=true,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=latticeback,carpeted=true,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=latticeback,carpeted=true,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,form=desk,carpeted=false,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_stool_desk_WOOD_NAME_VALUE" },
                "facing=south,form=desk,carpeted=false,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_stool_desk_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=desk,carpeted=false,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_stool_desk_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=desk,carpeted=false,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_stool_desk_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=desk,carpeted=true,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_stool_desk_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=desk,carpeted=true,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=desk,carpeted=true,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=desk,carpeted=true,carpet_color=cyan": { "model": "aestheticseating:block/cyan/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 90 },
                
                "facing=north,form=normal,carpeted=false,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_stool_normal_WOOD_NAME_VALUE" },
                "facing=south,form=normal,carpeted=false,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_stool_normal_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=normal,carpeted=false,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_stool_normal_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=normal,carpeted=false,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_stool_normal_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=normal,carpeted=true,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_stool_normal_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=normal,carpeted=true,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=normal,carpeted=true,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=normal,carpeted=true,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,form=latticeback,carpeted=false,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_stool_latticeback_WOOD_NAME_VALUE" },
                "facing=south,form=latticeback,carpeted=false,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=latticeback,carpeted=false,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=latticeback,carpeted=false,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=latticeback,carpeted=true,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=latticeback,carpeted=true,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=latticeback,carpeted=true,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=latticeback,carpeted=true,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,form=desk,carpeted=false,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_stool_desk_WOOD_NAME_VALUE" },
                "facing=south,form=desk,carpeted=false,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_stool_desk_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=desk,carpeted=false,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_stool_desk_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=desk,carpeted=false,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_stool_desk_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=desk,carpeted=true,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_stool_desk_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=desk,carpeted=true,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=desk,carpeted=true,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=desk,carpeted=true,carpet_color=light_blue": { "model": "aestheticseating:block/light_blue/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 90 },
                
                "facing=north,form=normal,carpeted=false,carpet_color=green": { "model": "aestheticseating:block/green/simple_stool_normal_WOOD_NAME_VALUE" },
                "facing=south,form=normal,carpeted=false,carpet_color=green": { "model": "aestheticseating:block/green/simple_stool_normal_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=normal,carpeted=false,carpet_color=green": { "model": "aestheticseating:block/green/simple_stool_normal_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=normal,carpeted=false,carpet_color=green": { "model": "aestheticseating:block/green/simple_stool_normal_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=normal,carpeted=true,carpet_color=green": { "model": "aestheticseating:block/green/simple_stool_normal_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=normal,carpeted=true,carpet_color=green": { "model": "aestheticseating:block/green/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=normal,carpeted=true,carpet_color=green": { "model": "aestheticseating:block/green/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=normal,carpeted=true,carpet_color=green": { "model": "aestheticseating:block/green/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,form=latticeback,carpeted=false,carpet_color=green": { "model": "aestheticseating:block/green/simple_stool_latticeback_WOOD_NAME_VALUE" },
                "facing=south,form=latticeback,carpeted=false,carpet_color=green": { "model": "aestheticseating:block/green/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=latticeback,carpeted=false,carpet_color=green": { "model": "aestheticseating:block/green/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=latticeback,carpeted=false,carpet_color=green": { "model": "aestheticseating:block/green/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=latticeback,carpeted=true,carpet_color=green": { "model": "aestheticseating:block/green/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=latticeback,carpeted=true,carpet_color=green": { "model": "aestheticseating:block/green/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=latticeback,carpeted=true,carpet_color=green": { "model": "aestheticseating:block/green/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=latticeback,carpeted=true,carpet_color=green": { "model": "aestheticseating:block/green/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,form=desk,carpeted=false,carpet_color=green": { "model": "aestheticseating:block/green/simple_stool_desk_WOOD_NAME_VALUE" },
                "facing=south,form=desk,carpeted=false,carpet_color=green": { "model": "aestheticseating:block/green/simple_stool_desk_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=desk,carpeted=false,carpet_color=green": { "model": "aestheticseating:block/green/simple_stool_desk_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=desk,carpeted=false,carpet_color=green": { "model": "aestheticseating:block/green/simple_stool_desk_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=desk,carpeted=true,carpet_color=green": { "model": "aestheticseating:block/green/simple_stool_desk_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=desk,carpeted=true,carpet_color=green": { "model": "aestheticseating:block/green/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=desk,carpeted=true,carpet_color=green": { "model": "aestheticseating:block/green/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=desk,carpeted=true,carpet_color=green": { "model": "aestheticseating:block/green/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 90 },
                
                "facing=north,form=normal,carpeted=false,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_stool_normal_WOOD_NAME_VALUE" },
                "facing=south,form=normal,carpeted=false,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_stool_normal_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=normal,carpeted=false,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_stool_normal_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=normal,carpeted=false,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_stool_normal_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=normal,carpeted=true,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_stool_normal_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=normal,carpeted=true,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=normal,carpeted=true,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=normal,carpeted=true,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_stool_normal_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,form=latticeback,carpeted=false,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_stool_latticeback_WOOD_NAME_VALUE" },
                "facing=south,form=latticeback,carpeted=false,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=latticeback,carpeted=false,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=latticeback,carpeted=false,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_stool_latticeback_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=latticeback,carpeted=true,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=latticeback,carpeted=true,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=latticeback,carpeted=true,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=latticeback,carpeted=true,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_stool_latticeback_WOOD_NAME_VALUE_carpeted", "y": 90 },
                "facing=north,form=desk,carpeted=false,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_stool_desk_WOOD_NAME_VALUE" },
                "facing=south,form=desk,carpeted=false,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_stool_desk_WOOD_NAME_VALUE", "y": 180 },
                "facing=west,form=desk,carpeted=false,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_stool_desk_WOOD_NAME_VALUE", "y": 270 },
                "facing=east,form=desk,carpeted=false,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_stool_desk_WOOD_NAME_VALUE", "y": 90 },
                "facing=north,form=desk,carpeted=true,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_stool_desk_WOOD_NAME_VALUE_carpeted" },
                "facing=south,form=desk,carpeted=true,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 180 },
                "facing=west,form=desk,carpeted=true,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 270 },
                "facing=east,form=desk,carpeted=true,carpet_color=lime": { "model": "aestheticseating:block/lime/simple_stool_desk_WOOD_NAME_VALUE_carpeted", "y": 90 }
              }
            }
            """;

    public static final String SIMPLE_BENCH_NORMAL_MODEL = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [64, 64],
            	"textures": {
            		"0": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE",
            		"particle": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE"
            	},
            	"elements": [
            		{
            			"from": [2, 0, 4.25],
            			"to": [4, 7.5, 6.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 3.75, 5.25]},
            			"faces": {
            				"north": {"uv": [4.5, 0.5, 5, 2.5], "texture": "#0"},
            				"east": {"uv": [1, 4.5, 1.5, 6.5], "texture": "#0"},
            				"south": {"uv": [1.5, 4.5, 2, 6.5], "texture": "#0"},
            				"west": {"uv": [2, 4.5, 2.5, 6.5], "texture": "#0"},
            				"up": {"uv": [6.5, 4.5, 6, 4], "texture": "#0"},
            				"down": {"uv": [6.5, 4.5, 6, 5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12, 0, 4.25],
            			"to": [14, 7.5, 6.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 3.75, 5.25]},
            			"faces": {
            				"north": {"uv": [2.5, 4.5, 3, 6.5], "texture": "#0"},
            				"east": {"uv": [4.5, 2.5, 5, 4.5], "texture": "#0"},
            				"south": {"uv": [3, 4.5, 3.5, 6.5], "texture": "#0"},
            				"west": {"uv": [3.5, 4.5, 4, 6.5], "texture": "#0"},
            				"up": {"uv": [6.5, 5.5, 6, 5], "texture": "#0"},
            				"down": {"uv": [6.5, 5.5, 6, 6], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12, 0, 9.75],
            			"to": [14, 7.5, 11.75],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 3.75, 10.75]},
            			"faces": {
            				"north": {"uv": [4.5, 4.5, 5, 6.5], "texture": "#0"},
            				"east": {"uv": [5, 0.5, 5.5, 2.5], "texture": "#0"},
            				"south": {"uv": [5, 2.5, 5.5, 4.5], "texture": "#0"},
            				"west": {"uv": [5, 4.5, 5.5, 6.5], "texture": "#0"},
            				"up": {"uv": [6.5, 6.5, 6, 6], "texture": "#0"},
            				"down": {"uv": [1.5, 6.5, 1, 7], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2, 0, 9.75],
            			"to": [4, 7.5, 11.75],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 3.75, 10.75]},
            			"faces": {
            				"north": {"uv": [5.5, 0.5, 6, 2.5], "texture": "#0"},
            				"east": {"uv": [5.5, 2.5, 6, 4.5], "texture": "#0"},
            				"south": {"uv": [4, 5.5, 4.5, 7.5], "texture": "#0"},
            				"west": {"uv": [5.5, 4.5, 6, 6.5], "texture": "#0"},
            				"up": {"uv": [2, 7, 1.5, 6.5], "texture": "#0"},
            				"down": {"uv": [2.5, 6.5, 2, 7], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 8, 11.6],
            			"to": [16, 9, 13.4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 12.5]},
            			"faces": {
            				"north": {"uv": [6, 0.5, 10, 0.75], "texture": "#0"},
            				"east": {"uv": [2.5, 6.5, 3, 6.75], "texture": "#0"},
            				"south": {"uv": [6, 0.75, 10, 1], "texture": "#0"},
            				"west": {"uv": [3, 6.5, 3.5, 6.75], "texture": "#0"},
            				"up": {"uv": [4, 0.5, 0, 0], "texture": "#0"},
            				"down": {"uv": [4, 0.5, 0, 1], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 8, 9.35],
            			"to": [16, 9, 11.15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 10.25]},
            			"faces": {
            				"north": {"uv": [6, 1, 10, 1.25], "texture": "#0"},
            				"east": {"uv": [3.5, 6.5, 4, 6.75], "texture": "#0"},
            				"south": {"uv": [6, 1.25, 10, 1.5], "texture": "#0"},
            				"west": {"uv": [6.5, 4, 7, 4.25], "texture": "#0"},
            				"up": {"uv": [4, 1.5, 0, 1], "texture": "#0"},
            				"down": {"uv": [4, 1.5, 0, 2], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 8, 7.1],
            			"to": [16, 9, 8.9],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 8]},
            			"faces": {
            				"north": {"uv": [6, 1.5, 10, 1.75], "texture": "#0"},
            				"east": {"uv": [6.5, 4.25, 7, 4.5], "texture": "#0"},
            				"south": {"uv": [6, 1.75, 10, 2], "texture": "#0"},
            				"west": {"uv": [4.5, 6.5, 5, 6.75], "texture": "#0"},
            				"up": {"uv": [4, 2.5, 0, 2], "texture": "#0"},
            				"down": {"uv": [4, 2.5, 0, 3], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 8, 4.85],
            			"to": [16, 9, 6.65],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 5.75]},
            			"faces": {
            				"north": {"uv": [6, 2, 10, 2.25], "texture": "#0"},
            				"east": {"uv": [6.5, 4.5, 7, 4.75], "texture": "#0"},
            				"south": {"uv": [6, 2.25, 10, 2.5], "texture": "#0"},
            				"west": {"uv": [6.5, 4.75, 7, 5], "texture": "#0"},
            				"up": {"uv": [4, 3.5, 0, 3], "texture": "#0"},
            				"down": {"uv": [4, 3.5, 0, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 8, 2.6],
            			"to": [16, 9, 4.4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 3.5]},
            			"faces": {
            				"north": {"uv": [6, 2.5, 10, 2.75], "texture": "#0"},
            				"east": {"uv": [5, 6.5, 5.5, 6.75], "texture": "#0"},
            				"south": {"uv": [6, 2.75, 10, 3], "texture": "#0"},
            				"west": {"uv": [6.5, 5, 7, 5.25], "texture": "#0"},
            				"up": {"uv": [4, 4.5, 0, 4], "texture": "#0"},
            				"down": {"uv": [8, 0, 4, 0.5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [1.8, 7.5, 2.8],
            			"to": [4.2, 8, 13.2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 7.75, 8]},
            			"faces": {
            				"north": {"uv": [6.5, 5.25, 7, 5.5], "texture": "#0"},
            				"east": {"uv": [6, 3, 8.5, 3.25], "texture": "#0"},
            				"south": {"uv": [5.5, 6.5, 6, 6.75], "texture": "#0"},
            				"west": {"uv": [6, 3.25, 8.5, 3.5], "texture": "#0"},
            				"up": {"uv": [4.5, 3, 4, 0.5], "texture": "#0"},
            				"down": {"uv": [4.5, 3, 4, 5.5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [11.8, 7.5, 2.8],
            			"to": [14.2, 8, 13.2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 7.75, 8]},
            			"faces": {
            				"north": {"uv": [6.5, 5.5, 7, 5.75], "texture": "#0"},
            				"east": {"uv": [6, 3.5, 8.5, 3.75], "texture": "#0"},
            				"south": {"uv": [6.5, 5.75, 7, 6], "texture": "#0"},
            				"west": {"uv": [6, 3.75, 8.5, 4], "texture": "#0"},
            				"up": {"uv": [0.5, 7, 0, 4.5], "texture": "#0"},
            				"down": {"uv": [1, 4.5, 0.5, 7], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2.7, 9, 3.2],
            			"to": [3.3, 9.15, 3.8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 9.125, 3.5]},
            			"faces": {
            				"north": {"uv": [6, 6.5, 6.25, 6.75], "texture": "#0"},
            				"east": {"uv": [6.5, 6, 6.75, 6.25], "texture": "#0"},
            				"south": {"uv": [6.25, 6.5, 6.5, 6.75], "texture": "#0"},
            				"west": {"uv": [6.5, 6.25, 6.75, 6.5], "texture": "#0"},
            				"up": {"uv": [6.75, 6.75, 6.5, 6.5], "texture": "#0"},
            				"down": {"uv": [2.75, 6.75, 2.5, 7], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2.7, 9, 5.45],
            			"to": [3.3, 9.15, 6.05],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 9.125, 5.75]},
            			"faces": {
            				"north": {"uv": [2.75, 6.75, 3, 7], "texture": "#0"},
            				"east": {"uv": [3, 6.75, 3.25, 7], "texture": "#0"},
            				"south": {"uv": [3.25, 6.75, 3.5, 7], "texture": "#0"},
            				"west": {"uv": [3.5, 6.75, 3.75, 7], "texture": "#0"},
            				"up": {"uv": [4, 7, 3.75, 6.75], "texture": "#0"},
            				"down": {"uv": [4.75, 6.75, 4.5, 7], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2.7, 9, 7.7],
            			"to": [3.3, 9.15, 8.3],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 9.125, 8]},
            			"faces": {
            				"north": {"uv": [4.75, 6.75, 5, 7], "texture": "#0"},
            				"east": {"uv": [5, 6.75, 5.25, 7], "texture": "#0"},
            				"south": {"uv": [5.25, 6.75, 5.5, 7], "texture": "#0"},
            				"west": {"uv": [5.5, 6.75, 5.75, 7], "texture": "#0"},
            				"up": {"uv": [6, 7, 5.75, 6.75], "texture": "#0"},
            				"down": {"uv": [6.25, 6.75, 6, 7], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2.7, 9, 9.95],
            			"to": [3.3, 9.15, 10.55],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 9.125, 10.25]},
            			"faces": {
            				"north": {"uv": [6.75, 6, 7, 6.25], "texture": "#0"},
            				"east": {"uv": [6.25, 6.75, 6.5, 7], "texture": "#0"},
            				"south": {"uv": [6.75, 6.25, 7, 6.5], "texture": "#0"},
            				"west": {"uv": [6.5, 6.75, 6.75, 7], "texture": "#0"},
            				"up": {"uv": [7, 6.75, 6.75, 6.5], "texture": "#0"},
            				"down": {"uv": [7, 6.75, 6.75, 7], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2.7, 9, 12.2],
            			"to": [3.3, 9.15, 12.8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 9.125, 12.5]},
            			"faces": {
            				"north": {"uv": [0, 7, 0.25, 7.25], "texture": "#0"},
            				"east": {"uv": [0.25, 7, 0.5, 7.25], "texture": "#0"},
            				"south": {"uv": [0.5, 7, 0.75, 7.25], "texture": "#0"},
            				"west": {"uv": [0.75, 7, 1, 7.25], "texture": "#0"},
            				"up": {"uv": [1.25, 7.25, 1, 7], "texture": "#0"},
            				"down": {"uv": [1.5, 7, 1.25, 7.25], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12.7, 9, 3.2],
            			"to": [13.3, 9.15, 3.8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 9.125, 3.5]},
            			"faces": {
            				"north": {"uv": [1.5, 7, 1.75, 7.25], "texture": "#0"},
            				"east": {"uv": [1.75, 7, 2, 7.25], "texture": "#0"},
            				"south": {"uv": [2, 7, 2.25, 7.25], "texture": "#0"},
            				"west": {"uv": [2.25, 7, 2.5, 7.25], "texture": "#0"},
            				"up": {"uv": [2.75, 7.25, 2.5, 7], "texture": "#0"},
            				"down": {"uv": [3, 7, 2.75, 7.25], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12.7, 9, 5.45],
            			"to": [13.3, 9.15, 6.05],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 9.125, 5.75]},
            			"faces": {
            				"north": {"uv": [3, 7, 3.25, 7.25], "texture": "#0"},
            				"east": {"uv": [3.25, 7, 3.5, 7.25], "texture": "#0"},
            				"south": {"uv": [3.5, 7, 3.75, 7.25], "texture": "#0"},
            				"west": {"uv": [3.75, 7, 4, 7.25], "texture": "#0"},
            				"up": {"uv": [7.25, 4.25, 7, 4], "texture": "#0"},
            				"down": {"uv": [7.25, 4.25, 7, 4.5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12.7, 9, 7.7],
            			"to": [13.3, 9.15, 8.3],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 9.125, 8]},
            			"faces": {
            				"north": {"uv": [4.5, 7, 4.75, 7.25], "texture": "#0"},
            				"east": {"uv": [7, 4.5, 7.25, 4.75], "texture": "#0"},
            				"south": {"uv": [4.75, 7, 5, 7.25], "texture": "#0"},
            				"west": {"uv": [7, 4.75, 7.25, 5], "texture": "#0"},
            				"up": {"uv": [5.25, 7.25, 5, 7], "texture": "#0"},
            				"down": {"uv": [7.25, 5, 7, 5.25], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12.7, 9, 9.95],
            			"to": [13.3, 9.15, 10.55],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 9.125, 10.25]},
            			"faces": {
            				"north": {"uv": [5.25, 7, 5.5, 7.25], "texture": "#0"},
            				"east": {"uv": [7, 5.25, 7.25, 5.5], "texture": "#0"},
            				"south": {"uv": [5.5, 7, 5.75, 7.25], "texture": "#0"},
            				"west": {"uv": [7, 5.5, 7.25, 5.75], "texture": "#0"},
            				"up": {"uv": [6, 7.25, 5.75, 7], "texture": "#0"},
            				"down": {"uv": [7.25, 5.75, 7, 6], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12.7, 9, 12.2],
            			"to": [13.3, 9.15, 12.8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 9.125, 12.5]},
            			"faces": {
            				"north": {"uv": [6, 7, 6.25, 7.25], "texture": "#0"},
            				"east": {"uv": [7, 6, 7.25, 6.25], "texture": "#0"},
            				"south": {"uv": [6.25, 7, 6.5, 7.25], "texture": "#0"},
            				"west": {"uv": [7, 6.25, 7.25, 6.5], "texture": "#0"},
            				"up": {"uv": [6.75, 7.25, 6.5, 7], "texture": "#0"},
            				"down": {"uv": [7.25, 6.5, 7, 6.75], "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [2, 0.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [2, 0.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [2, 0.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [2, 0.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, 45, 0],
            			"translation": [0, 0.75, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	},
            	"groups": [
            		{
            			"name": "bench",
            			"origin": [8, 8, 8],
            			"color": 0,
            			"children": [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
            		}
            	]
            }
            """;

    public static final String SIMPLE_BENCH_CENTER_MODEL = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [64, 64],
            	"textures": {
            		"0": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE",
            		"particle": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE"
            	},
            	"elements": [
            		{
            			"from": [0, 8, 11.6],
            			"to": [16, 9, 13.4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 12.5]},
            			"faces": {
            				"north": {"uv": [6, 0.5, 10, 0.75], "texture": "#0"},
            				"east": {"uv": [2.5, 6.5, 3, 6.75], "texture": "#0"},
            				"south": {"uv": [6, 0.75, 10, 1], "texture": "#0"},
            				"west": {"uv": [3, 6.5, 3.5, 6.75], "texture": "#0"},
            				"up": {"uv": [4, 0.5, 0, 0], "texture": "#0"},
            				"down": {"uv": [4, 0.5, 0, 1], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 8, 9.35],
            			"to": [16, 9, 11.15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 10.25]},
            			"faces": {
            				"north": {"uv": [6, 1, 10, 1.25], "texture": "#0"},
            				"east": {"uv": [3.5, 6.5, 4, 6.75], "texture": "#0"},
            				"south": {"uv": [6, 1.25, 10, 1.5], "texture": "#0"},
            				"west": {"uv": [6.5, 4, 7, 4.25], "texture": "#0"},
            				"up": {"uv": [4, 1.5, 0, 1], "texture": "#0"},
            				"down": {"uv": [4, 1.5, 0, 2], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 8, 7.1],
            			"to": [16, 9, 8.9],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 8]},
            			"faces": {
            				"north": {"uv": [6, 1.5, 10, 1.75], "texture": "#0"},
            				"east": {"uv": [6.5, 4.25, 7, 4.5], "texture": "#0"},
            				"south": {"uv": [6, 1.75, 10, 2], "texture": "#0"},
            				"west": {"uv": [4.5, 6.5, 5, 6.75], "texture": "#0"},
            				"up": {"uv": [4, 2.5, 0, 2], "texture": "#0"},
            				"down": {"uv": [4, 2.5, 0, 3], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 8, 4.85],
            			"to": [16, 9, 6.65],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 5.75]},
            			"faces": {
            				"north": {"uv": [6, 2, 10, 2.25], "texture": "#0"},
            				"east": {"uv": [6.5, 4.5, 7, 4.75], "texture": "#0"},
            				"south": {"uv": [6, 2.25, 10, 2.5], "texture": "#0"},
            				"west": {"uv": [6.5, 4.75, 7, 5], "texture": "#0"},
            				"up": {"uv": [4, 3.5, 0, 3], "texture": "#0"},
            				"down": {"uv": [4, 3.5, 0, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 8, 2.6],
            			"to": [16, 9, 4.4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 3.5]},
            			"faces": {
            				"north": {"uv": [6, 2.5, 10, 2.75], "texture": "#0"},
            				"east": {"uv": [5, 6.5, 5.5, 6.75], "texture": "#0"},
            				"south": {"uv": [6, 2.75, 10, 3], "texture": "#0"},
            				"west": {"uv": [6.5, 5, 7, 5.25], "texture": "#0"},
            				"up": {"uv": [4, 4.5, 0, 4], "texture": "#0"},
            				"down": {"uv": [8, 0, 4, 0.5], "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [2, 0.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [2, 0.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [2, 0.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [2, 0.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, 45, 0],
            			"translation": [0, 0.75, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	},
            	"groups": [
            		{
            			"name": "bench",
            			"origin": [8, 8, 8],
            			"color": 0,
            			"children": [0, 1, 2, 3, 4]
            		}
            	]
            }
            """;

    public static final String SIMPLE_BENCH_LEFT_MODEL = """
            {
             	"credit": "Made with Blockbench",
             	"texture_size": [64, 64],
             	"textures": {
             		"0": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE",
             		"particle": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE"
             	},
             	"elements": [
             		{
             			"from": [2, 0, 4.25],
             			"to": [4, 7.5, 6.25],
             			"rotation": {"angle": 0, "axis": "y", "origin": [3, 3.75, 5.25]},
             			"faces": {
             				"north": {"uv": [4.5, 0.5, 5, 2.5], "texture": "#0"},
             				"east": {"uv": [1, 4.5, 1.5, 6.5], "texture": "#0"},
             				"south": {"uv": [1.5, 4.5, 2, 6.5], "texture": "#0"},
             				"west": {"uv": [2, 4.5, 2.5, 6.5], "texture": "#0"},
             				"up": {"uv": [6.5, 4.5, 6, 4], "texture": "#0"},
             				"down": {"uv": [6.5, 4.5, 6, 5], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 0, 9.75],
             			"to": [4, 7.5, 11.75],
             			"rotation": {"angle": 0, "axis": "y", "origin": [3, 3.75, 10.75]},
             			"faces": {
             				"north": {"uv": [5.5, 0.5, 6, 2.5], "texture": "#0"},
             				"east": {"uv": [5.5, 2.5, 6, 4.5], "texture": "#0"},
             				"south": {"uv": [4, 5.5, 4.5, 7.5], "texture": "#0"},
             				"west": {"uv": [5.5, 4.5, 6, 6.5], "texture": "#0"},
             				"up": {"uv": [2, 7, 1.5, 6.5], "texture": "#0"},
             				"down": {"uv": [2.5, 6.5, 2, 7], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 8, 11.6],
             			"to": [16, 9, 13.4],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 12.5]},
             			"faces": {
             				"north": {"uv": [6, 0.5, 10, 0.75], "texture": "#0"},
             				"east": {"uv": [2.5, 6.5, 3, 6.75], "texture": "#0"},
             				"south": {"uv": [6, 0.75, 10, 1], "texture": "#0"},
             				"west": {"uv": [3, 6.5, 3.5, 6.75], "texture": "#0"},
             				"up": {"uv": [4, 0.5, 0, 0], "texture": "#0"},
             				"down": {"uv": [4, 0.5, 0, 1], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 8, 9.35],
             			"to": [16, 9, 11.15],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 10.25]},
             			"faces": {
             				"north": {"uv": [6, 1, 10, 1.25], "texture": "#0"},
             				"east": {"uv": [3.5, 6.5, 4, 6.75], "texture": "#0"},
             				"south": {"uv": [6, 1.25, 10, 1.5], "texture": "#0"},
             				"west": {"uv": [6.5, 4, 7, 4.25], "texture": "#0"},
             				"up": {"uv": [4, 1.5, 0, 1], "texture": "#0"},
             				"down": {"uv": [4, 1.5, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 8, 7.1],
             			"to": [16, 9, 8.9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 8]},
             			"faces": {
             				"north": {"uv": [6, 1.5, 10, 1.75], "texture": "#0"},
             				"east": {"uv": [6.5, 4.25, 7, 4.5], "texture": "#0"},
             				"south": {"uv": [6, 1.75, 10, 2], "texture": "#0"},
             				"west": {"uv": [4.5, 6.5, 5, 6.75], "texture": "#0"},
             				"up": {"uv": [4, 2.5, 0, 2], "texture": "#0"},
             				"down": {"uv": [4, 2.5, 0, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 8, 4.85],
             			"to": [16, 9, 6.65],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 5.75]},
             			"faces": {
             				"north": {"uv": [6, 2, 10, 2.25], "texture": "#0"},
             				"east": {"uv": [6.5, 4.5, 7, 4.75], "texture": "#0"},
             				"south": {"uv": [6, 2.25, 10, 2.5], "texture": "#0"},
             				"west": {"uv": [6.5, 4.75, 7, 5], "texture": "#0"},
             				"up": {"uv": [4, 3.5, 0, 3], "texture": "#0"},
             				"down": {"uv": [4, 3.5, 0, 4], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 8, 2.6],
             			"to": [16, 9, 4.4],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 3.5]},
             			"faces": {
             				"north": {"uv": [6, 2.5, 10, 2.75], "texture": "#0"},
             				"east": {"uv": [5, 6.5, 5.5, 6.75], "texture": "#0"},
             				"south": {"uv": [6, 2.75, 10, 3], "texture": "#0"},
             				"west": {"uv": [6.5, 5, 7, 5.25], "texture": "#0"},
             				"up": {"uv": [4, 4.5, 0, 4], "texture": "#0"},
             				"down": {"uv": [8, 0, 4, 0.5], "texture": "#0"}
             			}
             		},
             		{
             			"from": [1.8, 7.5, 2.8],
             			"to": [4.2, 8, 13.2],
             			"rotation": {"angle": 0, "axis": "y", "origin": [3, 7.75, 8]},
             			"faces": {
             				"north": {"uv": [6.5, 5.25, 7, 5.5], "texture": "#0"},
             				"east": {"uv": [6, 3, 8.5, 3.25], "texture": "#0"},
             				"south": {"uv": [5.5, 6.5, 6, 6.75], "texture": "#0"},
             				"west": {"uv": [6, 3.25, 8.5, 3.5], "texture": "#0"},
             				"up": {"uv": [4.5, 3, 4, 0.5], "texture": "#0"},
             				"down": {"uv": [4.5, 3, 4, 5.5], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2.7, 9, 3.2],
             			"to": [3.3, 9.15, 3.8],
             			"rotation": {"angle": 0, "axis": "y", "origin": [3, 9.125, 3.5]},
             			"faces": {
             				"north": {"uv": [6, 6.5, 6.25, 6.75], "texture": "#0"},
             				"east": {"uv": [6.5, 6, 6.75, 6.25], "texture": "#0"},
             				"south": {"uv": [6.25, 6.5, 6.5, 6.75], "texture": "#0"},
             				"west": {"uv": [6.5, 6.25, 6.75, 6.5], "texture": "#0"},
             				"up": {"uv": [6.75, 6.75, 6.5, 6.5], "texture": "#0"},
             				"down": {"uv": [2.75, 6.75, 2.5, 7], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2.7, 9, 5.45],
             			"to": [3.3, 9.15, 6.05],
             			"rotation": {"angle": 0, "axis": "y", "origin": [3, 9.125, 5.75]},
             			"faces": {
             				"north": {"uv": [2.75, 6.75, 3, 7], "texture": "#0"},
             				"east": {"uv": [3, 6.75, 3.25, 7], "texture": "#0"},
             				"south": {"uv": [3.25, 6.75, 3.5, 7], "texture": "#0"},
             				"west": {"uv": [3.5, 6.75, 3.75, 7], "texture": "#0"},
             				"up": {"uv": [4, 7, 3.75, 6.75], "texture": "#0"},
             				"down": {"uv": [4.75, 6.75, 4.5, 7], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2.7, 9, 7.7],
             			"to": [3.3, 9.15, 8.3],
             			"rotation": {"angle": 0, "axis": "y", "origin": [3, 9.125, 8]},
             			"faces": {
             				"north": {"uv": [4.75, 6.75, 5, 7], "texture": "#0"},
             				"east": {"uv": [5, 6.75, 5.25, 7], "texture": "#0"},
             				"south": {"uv": [5.25, 6.75, 5.5, 7], "texture": "#0"},
             				"west": {"uv": [5.5, 6.75, 5.75, 7], "texture": "#0"},
             				"up": {"uv": [6, 7, 5.75, 6.75], "texture": "#0"},
             				"down": {"uv": [6.25, 6.75, 6, 7], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2.7, 9, 9.95],
             			"to": [3.3, 9.15, 10.55],
             			"rotation": {"angle": 0, "axis": "y", "origin": [3, 9.125, 10.25]},
             			"faces": {
             				"north": {"uv": [6.75, 6, 7, 6.25], "texture": "#0"},
             				"east": {"uv": [6.25, 6.75, 6.5, 7], "texture": "#0"},
             				"south": {"uv": [6.75, 6.25, 7, 6.5], "texture": "#0"},
             				"west": {"uv": [6.5, 6.75, 6.75, 7], "texture": "#0"},
             				"up": {"uv": [7, 6.75, 6.75, 6.5], "texture": "#0"},
             				"down": {"uv": [7, 6.75, 6.75, 7], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2.7, 9, 12.2],
             			"to": [3.3, 9.15, 12.8],
             			"rotation": {"angle": 0, "axis": "y", "origin": [3, 9.125, 12.5]},
             			"faces": {
             				"north": {"uv": [0, 7, 0.25, 7.25], "texture": "#0"},
             				"east": {"uv": [0.25, 7, 0.5, 7.25], "texture": "#0"},
             				"south": {"uv": [0.5, 7, 0.75, 7.25], "texture": "#0"},
             				"west": {"uv": [0.75, 7, 1, 7.25], "texture": "#0"},
             				"up": {"uv": [1.25, 7.25, 1, 7], "texture": "#0"},
             				"down": {"uv": [1.5, 7, 1.25, 7.25], "texture": "#0"}
             			}
             		}
             	],
             	"display": {
             		"thirdperson_righthand": {
             			"translation": [2, 0.75, 0],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"thirdperson_lefthand": {
             			"translation": [2, 0.75, 0],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"firstperson_righthand": {
             			"translation": [2, 0.75, 0],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"firstperson_lefthand": {
             			"translation": [2, 0.75, 0],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"ground": {
             			"translation": [0, 1.75, 0],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"gui": {
             			"rotation": [20, 45, 0],
             			"translation": [0, 0.75, 0],
             			"scale": [0.6, 0.6, 0.6]
             		},
             		"fixed": {
             			"translation": [0, 0, 1],
             			"scale": [0.5, 0.5, 0.5]
             		}
             	},
             	"groups": [
             		{
             			"name": "bench",
             			"origin": [8, 8, 8],
             			"color": 0,
             			"children": [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
             		}
             	]
            }
            """;

    public static final String SIMPLE_BENCH_RIGHT_MODEL = """
            {
             	"credit": "Made with Blockbench",
             	"texture_size": [64, 64],
             	"textures": {
             		"0": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE",
             		"particle": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE"
             	},
             	"elements": [
             		{
             			"from": [12, 0, 4.25],
             			"to": [14, 7.5, 6.25],
             			"rotation": {"angle": 0, "axis": "y", "origin": [13, 3.75, 5.25]},
             			"faces": {
             				"north": {"uv": [2.5, 4.5, 3, 6.5], "texture": "#0"},
             				"east": {"uv": [4.5, 2.5, 5, 4.5], "texture": "#0"},
             				"south": {"uv": [3, 4.5, 3.5, 6.5], "texture": "#0"},
             				"west": {"uv": [3.5, 4.5, 4, 6.5], "texture": "#0"},
             				"up": {"uv": [6.5, 5.5, 6, 5], "texture": "#0"},
             				"down": {"uv": [6.5, 5.5, 6, 6], "texture": "#0"}
             			}
             		},
             		{
             			"from": [12, 0, 9.75],
             			"to": [14, 7.5, 11.75],
             			"rotation": {"angle": 0, "axis": "y", "origin": [13, 3.75, 10.75]},
             			"faces": {
             				"north": {"uv": [4.5, 4.5, 5, 6.5], "texture": "#0"},
             				"east": {"uv": [5, 0.5, 5.5, 2.5], "texture": "#0"},
             				"south": {"uv": [5, 2.5, 5.5, 4.5], "texture": "#0"},
             				"west": {"uv": [5, 4.5, 5.5, 6.5], "texture": "#0"},
             				"up": {"uv": [6.5, 6.5, 6, 6], "texture": "#0"},
             				"down": {"uv": [1.5, 6.5, 1, 7], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 8, 11.6],
             			"to": [16, 9, 13.4],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 12.5]},
             			"faces": {
             				"north": {"uv": [6, 0.5, 10, 0.75], "texture": "#0"},
             				"east": {"uv": [2.5, 6.5, 3, 6.75], "texture": "#0"},
             				"south": {"uv": [6, 0.75, 10, 1], "texture": "#0"},
             				"west": {"uv": [3, 6.5, 3.5, 6.75], "texture": "#0"},
             				"up": {"uv": [4, 0.5, 0, 0], "texture": "#0"},
             				"down": {"uv": [4, 0.5, 0, 1], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 8, 9.35],
             			"to": [16, 9, 11.15],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 10.25]},
             			"faces": {
             				"north": {"uv": [6, 1, 10, 1.25], "texture": "#0"},
             				"east": {"uv": [3.5, 6.5, 4, 6.75], "texture": "#0"},
             				"south": {"uv": [6, 1.25, 10, 1.5], "texture": "#0"},
             				"west": {"uv": [6.5, 4, 7, 4.25], "texture": "#0"},
             				"up": {"uv": [4, 1.5, 0, 1], "texture": "#0"},
             				"down": {"uv": [4, 1.5, 0, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 8, 7.1],
             			"to": [16, 9, 8.9],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 8]},
             			"faces": {
             				"north": {"uv": [6, 1.5, 10, 1.75], "texture": "#0"},
             				"east": {"uv": [6.5, 4.25, 7, 4.5], "texture": "#0"},
             				"south": {"uv": [6, 1.75, 10, 2], "texture": "#0"},
             				"west": {"uv": [4.5, 6.5, 5, 6.75], "texture": "#0"},
             				"up": {"uv": [4, 2.5, 0, 2], "texture": "#0"},
             				"down": {"uv": [4, 2.5, 0, 3], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 8, 4.85],
             			"to": [16, 9, 6.65],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 5.75]},
             			"faces": {
             				"north": {"uv": [6, 2, 10, 2.25], "texture": "#0"},
             				"east": {"uv": [6.5, 4.5, 7, 4.75], "texture": "#0"},
             				"south": {"uv": [6, 2.25, 10, 2.5], "texture": "#0"},
             				"west": {"uv": [6.5, 4.75, 7, 5], "texture": "#0"},
             				"up": {"uv": [4, 3.5, 0, 3], "texture": "#0"},
             				"down": {"uv": [4, 3.5, 0, 4], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 8, 2.6],
             			"to": [16, 9, 4.4],
             			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 3.5]},
             			"faces": {
             				"north": {"uv": [6, 2.5, 10, 2.75], "texture": "#0"},
             				"east": {"uv": [5, 6.5, 5.5, 6.75], "texture": "#0"},
             				"south": {"uv": [6, 2.75, 10, 3], "texture": "#0"},
             				"west": {"uv": [6.5, 5, 7, 5.25], "texture": "#0"},
             				"up": {"uv": [4, 4.5, 0, 4], "texture": "#0"},
             				"down": {"uv": [8, 0, 4, 0.5], "texture": "#0"}
             			}
             		},
             		{
             			"from": [11.8, 7.5, 2.8],
             			"to": [14.2, 8, 13.2],
             			"rotation": {"angle": 0, "axis": "y", "origin": [13, 7.75, 8]},
             			"faces": {
             				"north": {"uv": [6.5, 5.5, 7, 5.75], "texture": "#0"},
             				"east": {"uv": [6, 3.5, 8.5, 3.75], "texture": "#0"},
             				"south": {"uv": [6.5, 5.75, 7, 6], "texture": "#0"},
             				"west": {"uv": [6, 3.75, 8.5, 4], "texture": "#0"},
             				"up": {"uv": [0.5, 7, 0, 4.5], "texture": "#0"},
             				"down": {"uv": [1, 4.5, 0.5, 7], "texture": "#0"}
             			}
             		},
             		{
             			"from": [12.7, 9, 3.2],
             			"to": [13.3, 9.15, 3.8],
             			"rotation": {"angle": 0, "axis": "y", "origin": [13, 9.125, 3.5]},
             			"faces": {
             				"north": {"uv": [1.5, 7, 1.75, 7.25], "texture": "#0"},
             				"east": {"uv": [1.75, 7, 2, 7.25], "texture": "#0"},
             				"south": {"uv": [2, 7, 2.25, 7.25], "texture": "#0"},
             				"west": {"uv": [2.25, 7, 2.5, 7.25], "texture": "#0"},
             				"up": {"uv": [2.75, 7.25, 2.5, 7], "texture": "#0"},
             				"down": {"uv": [3, 7, 2.75, 7.25], "texture": "#0"}
             			}
             		},
             		{
             			"from": [12.7, 9, 5.45],
             			"to": [13.3, 9.15, 6.05],
             			"rotation": {"angle": 0, "axis": "y", "origin": [13, 9.125, 5.75]},
             			"faces": {
             				"north": {"uv": [3, 7, 3.25, 7.25], "texture": "#0"},
             				"east": {"uv": [3.25, 7, 3.5, 7.25], "texture": "#0"},
             				"south": {"uv": [3.5, 7, 3.75, 7.25], "texture": "#0"},
             				"west": {"uv": [3.75, 7, 4, 7.25], "texture": "#0"},
             				"up": {"uv": [7.25, 4.25, 7, 4], "texture": "#0"},
             				"down": {"uv": [7.25, 4.25, 7, 4.5], "texture": "#0"}
             			}
             		},
             		{
             			"from": [12.7, 9, 7.7],
             			"to": [13.3, 9.15, 8.3],
             			"rotation": {"angle": 0, "axis": "y", "origin": [13, 9.125, 8]},
             			"faces": {
             				"north": {"uv": [4.5, 7, 4.75, 7.25], "texture": "#0"},
             				"east": {"uv": [7, 4.5, 7.25, 4.75], "texture": "#0"},
             				"south": {"uv": [4.75, 7, 5, 7.25], "texture": "#0"},
             				"west": {"uv": [7, 4.75, 7.25, 5], "texture": "#0"},
             				"up": {"uv": [5.25, 7.25, 5, 7], "texture": "#0"},
             				"down": {"uv": [7.25, 5, 7, 5.25], "texture": "#0"}
             			}
             		},
             		{
             			"from": [12.7, 9, 9.95],
             			"to": [13.3, 9.15, 10.55],
             			"rotation": {"angle": 0, "axis": "y", "origin": [13, 9.125, 10.25]},
             			"faces": {
             				"north": {"uv": [5.25, 7, 5.5, 7.25], "texture": "#0"},
             				"east": {"uv": [7, 5.25, 7.25, 5.5], "texture": "#0"},
             				"south": {"uv": [5.5, 7, 5.75, 7.25], "texture": "#0"},
             				"west": {"uv": [7, 5.5, 7.25, 5.75], "texture": "#0"},
             				"up": {"uv": [6, 7.25, 5.75, 7], "texture": "#0"},
             				"down": {"uv": [7.25, 5.75, 7, 6], "texture": "#0"}
             			}
             		},
             		{
             			"from": [12.7, 9, 12.2],
             			"to": [13.3, 9.15, 12.8],
             			"rotation": {"angle": 0, "axis": "y", "origin": [13, 9.125, 12.5]},
             			"faces": {
             				"north": {"uv": [6, 7, 6.25, 7.25], "texture": "#0"},
             				"east": {"uv": [7, 6, 7.25, 6.25], "texture": "#0"},
             				"south": {"uv": [6.25, 7, 6.5, 7.25], "texture": "#0"},
             				"west": {"uv": [7, 6.25, 7.25, 6.5], "texture": "#0"},
             				"up": {"uv": [6.75, 7.25, 6.5, 7], "texture": "#0"},
             				"down": {"uv": [7.25, 6.5, 7, 6.75], "texture": "#0"}
             			}
             		}
             	],
             	"display": {
             		"thirdperson_righthand": {
             			"translation": [2, 0.75, 0],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"thirdperson_lefthand": {
             			"translation": [2, 0.75, 0],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"firstperson_righthand": {
             			"translation": [2, 0.75, 0],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"firstperson_lefthand": {
             			"translation": [2, 0.75, 0],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"ground": {
             			"translation": [0, 1.75, 0],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"gui": {
             			"rotation": [20, 45, 0],
             			"translation": [0, 0.75, 0],
             			"scale": [0.6, 0.6, 0.6]
             		},
             		"fixed": {
             			"translation": [0, 0, 1],
             			"scale": [0.5, 0.5, 0.5]
             		}
             	},
             	"groups": [
             		{
             			"name": "bench",
             			"origin": [8, 8, 8],
             			"color": 0,
             			"children": [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
             		}
             	]
            }
            """;

    public static final String SIMPLE_BENCH_NORMAL_BACKREST_MODEL = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [64, 64],
            	"textures": {
            		"0": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE",
            		"particle": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE"
            	},
            	"elements": [
            		{
            			"from": [2, 0, 4.25],
            			"to": [4, 7.5, 6.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 3.75, 5.25]},
            			"faces": {
            				"north": {"uv": [4.5, 0.5, 5, 2.5], "texture": "#0"},
            				"east": {"uv": [1, 4.5, 1.5, 6.5], "texture": "#0"},
            				"south": {"uv": [1.5, 4.5, 2, 6.5], "texture": "#0"},
            				"west": {"uv": [2, 4.5, 2.5, 6.5], "texture": "#0"},
            				"up": {"uv": [6.5, 4.5, 6, 4], "texture": "#0"},
            				"down": {"uv": [6.5, 4.5, 6, 5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12, 0, 4.25],
            			"to": [14, 7.5, 6.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 3.75, 5.25]},
            			"faces": {
            				"north": {"uv": [2.5, 4.5, 3, 6.5], "texture": "#0"},
            				"east": {"uv": [4.5, 2.5, 5, 4.5], "texture": "#0"},
            				"south": {"uv": [3, 4.5, 3.5, 6.5], "texture": "#0"},
            				"west": {"uv": [3.5, 4.5, 4, 6.5], "texture": "#0"},
            				"up": {"uv": [6.5, 5.5, 6, 5], "texture": "#0"},
            				"down": {"uv": [6.5, 5.5, 6, 6], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12, 0, 9.75],
            			"to": [14, 7.5, 11.75],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 3.75, 10.75]},
            			"faces": {
            				"north": {"uv": [4.5, 4.5, 5, 6.5], "texture": "#0"},
            				"east": {"uv": [5, 0.5, 5.5, 2.5], "texture": "#0"},
            				"south": {"uv": [5, 2.5, 5.5, 4.5], "texture": "#0"},
            				"west": {"uv": [5, 4.5, 5.5, 6.5], "texture": "#0"},
            				"up": {"uv": [6.5, 6.5, 6, 6], "texture": "#0"},
            				"down": {"uv": [1.5, 6.5, 1, 7], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2, 0, 9.75],
            			"to": [4, 7.5, 11.75],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 3.75, 10.75]},
            			"faces": {
            				"north": {"uv": [5.5, 0.5, 6, 2.5], "texture": "#0"},
            				"east": {"uv": [5.5, 2.5, 6, 4.5], "texture": "#0"},
            				"south": {"uv": [4, 5.5, 4.5, 7.5], "texture": "#0"},
            				"west": {"uv": [5.5, 4.5, 6, 6.5], "texture": "#0"},
            				"up": {"uv": [2, 7, 1.5, 6.5], "texture": "#0"},
            				"down": {"uv": [2.5, 6.5, 2, 7], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 8, 11.6],
            			"to": [16, 9, 13.4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 12.5]},
            			"faces": {
            				"north": {"uv": [6, 0.5, 10, 0.75], "texture": "#0"},
            				"east": {"uv": [2.5, 6.5, 3, 6.75], "texture": "#0"},
            				"south": {"uv": [6, 0.75, 10, 1], "texture": "#0"},
            				"west": {"uv": [3, 6.5, 3.5, 6.75], "texture": "#0"},
            				"up": {"uv": [4, 0.5, 0, 0], "texture": "#0"},
            				"down": {"uv": [4, 0.5, 0, 1], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 8, 9.35],
            			"to": [16, 9, 11.15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 10.25]},
            			"faces": {
            				"north": {"uv": [6, 1, 10, 1.25], "texture": "#0"},
            				"east": {"uv": [3.5, 6.5, 4, 6.75], "texture": "#0"},
            				"south": {"uv": [6, 1.25, 10, 1.5], "texture": "#0"},
            				"west": {"uv": [6.5, 4, 7, 4.25], "texture": "#0"},
            				"up": {"uv": [4, 1.5, 0, 1], "texture": "#0"},
            				"down": {"uv": [4, 1.5, 0, 2], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 8, 7.1],
            			"to": [16, 9, 8.9],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 8]},
            			"faces": {
            				"north": {"uv": [6, 1.5, 10, 1.75], "texture": "#0"},
            				"east": {"uv": [6.5, 4.25, 7, 4.5], "texture": "#0"},
            				"south": {"uv": [6, 1.75, 10, 2], "texture": "#0"},
            				"west": {"uv": [4.5, 6.5, 5, 6.75], "texture": "#0"},
            				"up": {"uv": [4, 2.5, 0, 2], "texture": "#0"},
            				"down": {"uv": [4, 2.5, 0, 3], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 8, 4.85],
            			"to": [16, 9, 6.65],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 5.75]},
            			"faces": {
            				"north": {"uv": [6, 2, 10, 2.25], "texture": "#0"},
            				"east": {"uv": [6.5, 4.5, 7, 4.75], "texture": "#0"},
            				"south": {"uv": [6, 2.25, 10, 2.5], "texture": "#0"},
            				"west": {"uv": [6.5, 4.75, 7, 5], "texture": "#0"},
            				"up": {"uv": [4, 3.5, 0, 3], "texture": "#0"},
            				"down": {"uv": [4, 3.5, 0, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 8, 2.6],
            			"to": [16, 9, 4.4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 3.5]},
            			"faces": {
            				"north": {"uv": [6, 2.5, 10, 2.75], "texture": "#0"},
            				"east": {"uv": [5, 6.5, 5.5, 6.75], "texture": "#0"},
            				"south": {"uv": [6, 2.75, 10, 3], "texture": "#0"},
            				"west": {"uv": [6.5, 5, 7, 5.25], "texture": "#0"},
            				"up": {"uv": [4, 4.5, 0, 4], "texture": "#0"},
            				"down": {"uv": [8, 0, 4, 0.5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [1.8, 7.5, 2.8],
            			"to": [4.2, 8, 13.2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 7.75, 8]},
            			"faces": {
            				"north": {"uv": [6.5, 5.25, 7, 5.5], "texture": "#0"},
            				"east": {"uv": [6, 3, 8.5, 3.25], "texture": "#0"},
            				"south": {"uv": [5.5, 6.5, 6, 6.75], "texture": "#0"},
            				"west": {"uv": [6, 3.25, 8.5, 3.5], "texture": "#0"},
            				"up": {"uv": [4.5, 3, 4, 0.5], "texture": "#0"},
            				"down": {"uv": [4.5, 3, 4, 5.5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [11.8, 7.5, 2.8],
            			"to": [14.2, 8, 13.2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 7.75, 8]},
            			"faces": {
            				"north": {"uv": [6.5, 5.5, 7, 5.75], "texture": "#0"},
            				"east": {"uv": [6, 3.5, 8.5, 3.75], "texture": "#0"},
            				"south": {"uv": [6.5, 5.75, 7, 6], "texture": "#0"},
            				"west": {"uv": [6, 3.75, 8.5, 4], "texture": "#0"},
            				"up": {"uv": [0.5, 7, 0, 4.5], "texture": "#0"},
            				"down": {"uv": [1, 4.5, 0.5, 7], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2.7, 9, 3.2],
            			"to": [3.3, 9.15, 3.8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 9.125, 3.5]},
            			"faces": {
            				"north": {"uv": [6, 6.5, 6.25, 6.75], "texture": "#0"},
            				"east": {"uv": [6.5, 6, 6.75, 6.25], "texture": "#0"},
            				"south": {"uv": [6.25, 6.5, 6.5, 6.75], "texture": "#0"},
            				"west": {"uv": [6.5, 6.25, 6.75, 6.5], "texture": "#0"},
            				"up": {"uv": [6.75, 6.75, 6.5, 6.5], "texture": "#0"},
            				"down": {"uv": [2.75, 6.75, 2.5, 7], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2.7, 9, 5.45],
            			"to": [3.3, 9.15, 6.05],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 9.125, 5.75]},
            			"faces": {
            				"north": {"uv": [2.75, 6.75, 3, 7], "texture": "#0"},
            				"east": {"uv": [3, 6.75, 3.25, 7], "texture": "#0"},
            				"south": {"uv": [3.25, 6.75, 3.5, 7], "texture": "#0"},
            				"west": {"uv": [3.5, 6.75, 3.75, 7], "texture": "#0"},
            				"up": {"uv": [4, 7, 3.75, 6.75], "texture": "#0"},
            				"down": {"uv": [4.75, 6.75, 4.5, 7], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2.7, 9, 7.7],
            			"to": [3.3, 9.15, 8.3],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 9.125, 8]},
            			"faces": {
            				"north": {"uv": [4.75, 6.75, 5, 7], "texture": "#0"},
            				"east": {"uv": [5, 6.75, 5.25, 7], "texture": "#0"},
            				"south": {"uv": [5.25, 6.75, 5.5, 7], "texture": "#0"},
            				"west": {"uv": [5.5, 6.75, 5.75, 7], "texture": "#0"},
            				"up": {"uv": [6, 7, 5.75, 6.75], "texture": "#0"},
            				"down": {"uv": [6.25, 6.75, 6, 7], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2.7, 9, 9.95],
            			"to": [3.3, 9.15, 10.55],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 9.125, 10.25]},
            			"faces": {
            				"north": {"uv": [6.75, 6, 7, 6.25], "texture": "#0"},
            				"east": {"uv": [6.25, 6.75, 6.5, 7], "texture": "#0"},
            				"south": {"uv": [6.75, 6.25, 7, 6.5], "texture": "#0"},
            				"west": {"uv": [6.5, 6.75, 6.75, 7], "texture": "#0"},
            				"up": {"uv": [7, 6.75, 6.75, 6.5], "texture": "#0"},
            				"down": {"uv": [7, 6.75, 6.75, 7], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2.7, 9, 12.2],
            			"to": [3.3, 9.15, 12.8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 9.125, 12.5]},
            			"faces": {
            				"north": {"uv": [0, 7, 0.25, 7.25], "texture": "#0"},
            				"east": {"uv": [0.25, 7, 0.5, 7.25], "texture": "#0"},
            				"south": {"uv": [0.5, 7, 0.75, 7.25], "texture": "#0"},
            				"west": {"uv": [0.75, 7, 1, 7.25], "texture": "#0"},
            				"up": {"uv": [1.25, 7.25, 1, 7], "texture": "#0"},
            				"down": {"uv": [1.5, 7, 1.25, 7.25], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12.7, 9, 3.2],
            			"to": [13.3, 9.15, 3.8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 9.125, 3.5]},
            			"faces": {
            				"north": {"uv": [1.5, 7, 1.75, 7.25], "texture": "#0"},
            				"east": {"uv": [1.75, 7, 2, 7.25], "texture": "#0"},
            				"south": {"uv": [2, 7, 2.25, 7.25], "texture": "#0"},
            				"west": {"uv": [2.25, 7, 2.5, 7.25], "texture": "#0"},
            				"up": {"uv": [2.75, 7.25, 2.5, 7], "texture": "#0"},
            				"down": {"uv": [3, 7, 2.75, 7.25], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12.7, 9, 5.45],
            			"to": [13.3, 9.15, 6.05],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 9.125, 5.75]},
            			"faces": {
            				"north": {"uv": [3, 7, 3.25, 7.25], "texture": "#0"},
            				"east": {"uv": [3.25, 7, 3.5, 7.25], "texture": "#0"},
            				"south": {"uv": [3.5, 7, 3.75, 7.25], "texture": "#0"},
            				"west": {"uv": [3.75, 7, 4, 7.25], "texture": "#0"},
            				"up": {"uv": [7.25, 4.25, 7, 4], "texture": "#0"},
            				"down": {"uv": [7.25, 4.25, 7, 4.5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12.7, 9, 7.7],
            			"to": [13.3, 9.15, 8.3],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 9.125, 8]},
            			"faces": {
            				"north": {"uv": [4.5, 7, 4.75, 7.25], "texture": "#0"},
            				"east": {"uv": [7, 4.5, 7.25, 4.75], "texture": "#0"},
            				"south": {"uv": [4.75, 7, 5, 7.25], "texture": "#0"},
            				"west": {"uv": [7, 4.75, 7.25, 5], "texture": "#0"},
            				"up": {"uv": [5.25, 7.25, 5, 7], "texture": "#0"},
            				"down": {"uv": [7.25, 5, 7, 5.25], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12.7, 9, 9.95],
            			"to": [13.3, 9.15, 10.55],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 9.125, 10.25]},
            			"faces": {
            				"north": {"uv": [5.25, 7, 5.5, 7.25], "texture": "#0"},
            				"east": {"uv": [7, 5.25, 7.25, 5.5], "texture": "#0"},
            				"south": {"uv": [5.5, 7, 5.75, 7.25], "texture": "#0"},
            				"west": {"uv": [7, 5.5, 7.25, 5.75], "texture": "#0"},
            				"up": {"uv": [6, 7.25, 5.75, 7], "texture": "#0"},
            				"down": {"uv": [7.25, 5.75, 7, 6], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12.7, 9, 12.2],
            			"to": [13.3, 9.15, 12.8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 9.125, 12.5]},
            			"faces": {
            				"north": {"uv": [6, 7, 6.25, 7.25], "texture": "#0"},
            				"east": {"uv": [7, 6, 7.25, 6.25], "texture": "#0"},
            				"south": {"uv": [6.25, 7, 6.5, 7.25], "texture": "#0"},
            				"west": {"uv": [7, 6.25, 7.25, 6.5], "texture": "#0"},
            				"up": {"uv": [6.75, 7.25, 6.5, 7], "texture": "#0"},
            				"down": {"uv": [7.25, 6.5, 7, 6.75], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 11.1625, 0.4875],
            			"to": [16, 12.9625, 1.4875],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [4, 1.5, 0, 2], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [3.5, 6.5, 4, 6.75], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [4, 1.5, 0, 1], "texture": "#0"},
            				"west": {"uv": [6.5, 4, 7, 4.25], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [6, 1, 10, 1.25], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [6, 1.25, 10, 1.5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 13.4125, 0.4875],
            			"to": [16, 15.2125, 1.4875],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [4, 2.5, 0, 3], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [6.5, 4.25, 7, 4.5], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [4, 2.5, 0, 2], "texture": "#0"},
            				"west": {"uv": [4.5, 6.5, 5, 6.75], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [6, 1.5, 10, 1.75], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [6, 1.75, 10, 2], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 15.6625, 0.4875],
            			"to": [16, 17.4625, 1.4875],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [4, 3.5, 0, 4], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [6.5, 4.5, 7, 4.75], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [4, 3.5, 0, 3], "texture": "#0"},
            				"west": {"uv": [6.5, 4.75, 7, 5], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [6, 2, 10, 2.25], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [6, 2.25, 10, 2.5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 17.9125, 0.4875],
            			"to": [16, 19.7125, 1.4875],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [8, 0, 4, 0.5], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [5, 6.5, 5.5, 6.75], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [4, 4.5, 0, 4], "texture": "#0"},
            				"west": {"uv": [6.5, 5, 7, 5.25], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [6, 2.5, 10, 2.75], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [6, 2.75, 10, 3], "texture": "#0"}
            			}
            		},
            		{
            			"from": [1.9, 7.1125, -0.0125],
            			"to": [4.1, 19.5125, 0.4875],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [4.5, 3, 4, 5.5], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [6, 3, 8.5, 3.25], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [4.5, 3, 4, 0.5], "texture": "#0"},
            				"west": {"uv": [6, 3.25, 8.5, 3.5], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [6.5, 5.25, 7, 5.5], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [5.5, 6.5, 6, 6.75], "texture": "#0"}
            			}
            		},
            		{
            			"from": [11.9, 7.1125, -0.0125],
            			"to": [14.1, 19.5125, 0.4875],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [1, 4.5, 0.5, 7], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [6, 3.5, 8.5, 3.75], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [0.5, 7, 0, 4.5], "texture": "#0"},
            				"west": {"uv": [6, 3.75, 8.5, 4], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [6.5, 5.5, 7, 5.75], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [6.5, 5.75, 7, 6], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2.7, 18.5125, 1.4875],
            			"to": [3.3, 19.1125, 1.6375],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [2.75, 6.75, 2.5, 7], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [6.5, 6, 6.75, 6.25], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [6.75, 6.75, 6.5, 6.5], "texture": "#0"},
            				"west": {"uv": [6.5, 6.25, 6.75, 6.5], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [6, 6.5, 6.25, 6.75], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [6.25, 6.5, 6.5, 6.75], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2.7, 16.2625, 1.4875],
            			"to": [3.3, 16.8625, 1.6375],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [4.75, 6.75, 4.5, 7], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [3, 6.75, 3.25, 7], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [4, 7, 3.75, 6.75], "texture": "#0"},
            				"west": {"uv": [3.5, 6.75, 3.75, 7], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [2.75, 6.75, 3, 7], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [3.25, 6.75, 3.5, 7], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2.7, 14.0125, 1.4875],
            			"to": [3.3, 14.6125, 1.6375],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [6.25, 6.75, 6, 7], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [5, 6.75, 5.25, 7], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [6, 7, 5.75, 6.75], "texture": "#0"},
            				"west": {"uv": [5.5, 6.75, 5.75, 7], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [4.75, 6.75, 5, 7], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [5.25, 6.75, 5.5, 7], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2.7, 11.7625, 1.4875],
            			"to": [3.3, 12.3625, 1.6375],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [7, 6.75, 6.75, 7], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [6.25, 6.75, 6.5, 7], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [7, 6.75, 6.75, 6.5], "texture": "#0"},
            				"west": {"uv": [6.5, 6.75, 6.75, 7], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [6.75, 6, 7, 6.25], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [6.75, 6.25, 7, 6.5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12.7, 18.5125, 1.4875],
            			"to": [13.3, 19.1125, 1.6375],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [3, 7, 2.75, 7.25], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [1.75, 7, 2, 7.25], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [2.75, 7.25, 2.5, 7], "texture": "#0"},
            				"west": {"uv": [2.25, 7, 2.5, 7.25], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [1.5, 7, 1.75, 7.25], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [2, 7, 2.25, 7.25], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12.7, 16.2625, 1.4875],
            			"to": [13.3, 16.8625, 1.6375],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [7.25, 4.25, 7, 4.5], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [3.25, 7, 3.5, 7.25], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [7.25, 4.25, 7, 4], "texture": "#0"},
            				"west": {"uv": [3.75, 7, 4, 7.25], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [3, 7, 3.25, 7.25], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [3.5, 7, 3.75, 7.25], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12.7, 14.0125, 1.4875],
            			"to": [13.3, 14.6125, 1.6375],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [7.25, 5, 7, 5.25], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [7, 4.5, 7.25, 4.75], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [5.25, 7.25, 5, 7], "texture": "#0"},
            				"west": {"uv": [7, 4.75, 7.25, 5], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [4.5, 7, 4.75, 7.25], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [4.75, 7, 5, 7.25], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12.7, 11.7625, 1.4875],
            			"to": [13.3, 12.3625, 1.6375],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [7.25, 5.75, 7, 6], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [7, 5.25, 7.25, 5.5], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [6, 7.25, 5.75, 7], "texture": "#0"},
            				"west": {"uv": [7, 5.5, 7.25, 5.75], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [5.25, 7, 5.5, 7.25], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [5.5, 7, 5.75, 7.25], "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [2, 0.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [2, 0.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [2, 0.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [2, 0.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, 45, 0],
            			"translation": [0, 0.75, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	},
            	"groups": [
            		{
            			"name": "bench",
            			"origin": [8, 8, 8],
            			"color": 0,
            			"children": [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34]
            		}
            	]
            }
            """;

    public static final String SIMPLE_BENCH_CENTER_BACKREST_MODEL = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [64, 64],
            	"textures": {
            		"0": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE",
            		"particle": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE"
            	},
            	"elements": [
            		{
            			"from": [0, 8, 11.6],
            			"to": [16, 9, 13.4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 12.5]},
            			"faces": {
            				"north": {"uv": [6, 0.5, 10, 0.75], "texture": "#0"},
            				"east": {"uv": [2.5, 6.5, 3, 6.75], "texture": "#0"},
            				"south": {"uv": [6, 0.75, 10, 1], "texture": "#0"},
            				"west": {"uv": [3, 6.5, 3.5, 6.75], "texture": "#0"},
            				"up": {"uv": [4, 0.5, 0, 0], "texture": "#0"},
            				"down": {"uv": [4, 0.5, 0, 1], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 8, 9.35],
            			"to": [16, 9, 11.15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 10.25]},
            			"faces": {
            				"north": {"uv": [6, 1, 10, 1.25], "texture": "#0"},
            				"east": {"uv": [3.5, 6.5, 4, 6.75], "texture": "#0"},
            				"south": {"uv": [6, 1.25, 10, 1.5], "texture": "#0"},
            				"west": {"uv": [6.5, 4, 7, 4.25], "texture": "#0"},
            				"up": {"uv": [4, 1.5, 0, 1], "texture": "#0"},
            				"down": {"uv": [4, 1.5, 0, 2], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 8, 7.1],
            			"to": [16, 9, 8.9],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 8]},
            			"faces": {
            				"north": {"uv": [6, 1.5, 10, 1.75], "texture": "#0"},
            				"east": {"uv": [6.5, 4.25, 7, 4.5], "texture": "#0"},
            				"south": {"uv": [6, 1.75, 10, 2], "texture": "#0"},
            				"west": {"uv": [4.5, 6.5, 5, 6.75], "texture": "#0"},
            				"up": {"uv": [4, 2.5, 0, 2], "texture": "#0"},
            				"down": {"uv": [4, 2.5, 0, 3], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 8, 4.85],
            			"to": [16, 9, 6.65],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 5.75]},
            			"faces": {
            				"north": {"uv": [6, 2, 10, 2.25], "texture": "#0"},
            				"east": {"uv": [6.5, 4.5, 7, 4.75], "texture": "#0"},
            				"south": {"uv": [6, 2.25, 10, 2.5], "texture": "#0"},
            				"west": {"uv": [6.5, 4.75, 7, 5], "texture": "#0"},
            				"up": {"uv": [4, 3.5, 0, 3], "texture": "#0"},
            				"down": {"uv": [4, 3.5, 0, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 8, 2.6],
            			"to": [16, 9, 4.4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 3.5]},
            			"faces": {
            				"north": {"uv": [6, 2.5, 10, 2.75], "texture": "#0"},
            				"east": {"uv": [5, 6.5, 5.5, 6.75], "texture": "#0"},
            				"south": {"uv": [6, 2.75, 10, 3], "texture": "#0"},
            				"west": {"uv": [6.5, 5, 7, 5.25], "texture": "#0"},
            				"up": {"uv": [4, 4.5, 0, 4], "texture": "#0"},
            				"down": {"uv": [8, 0, 4, 0.5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 11.1625, 0.4875],
            			"to": [16, 12.9625, 1.4875],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [4, 1.5, 0, 2], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [3.5, 6.5, 4, 6.75], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [4, 1.5, 0, 1], "texture": "#0"},
            				"west": {"uv": [6.5, 4, 7, 4.25], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [6, 1, 10, 1.25], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [6, 1.25, 10, 1.5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 13.4125, 0.4875],
            			"to": [16, 15.2125, 1.4875],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [4, 2.5, 0, 3], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [6.5, 4.25, 7, 4.5], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [4, 2.5, 0, 2], "texture": "#0"},
            				"west": {"uv": [4.5, 6.5, 5, 6.75], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [6, 1.5, 10, 1.75], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [6, 1.75, 10, 2], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 15.6625, 0.4875],
            			"to": [16, 17.4625, 1.4875],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [4, 3.5, 0, 4], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [6.5, 4.5, 7, 4.75], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [4, 3.5, 0, 3], "texture": "#0"},
            				"west": {"uv": [6.5, 4.75, 7, 5], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [6, 2, 10, 2.25], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [6, 2.25, 10, 2.5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 17.9125, 0.4875],
            			"to": [16, 19.7125, 1.4875],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [8, 0, 4, 0.5], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [5, 6.5, 5.5, 6.75], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [4, 4.5, 0, 4], "texture": "#0"},
            				"west": {"uv": [6.5, 5, 7, 5.25], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [6, 2.5, 10, 2.75], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [6, 2.75, 10, 3], "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [2, 0.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [2, 0.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [2, 0.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [2, 0.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, 45, 0],
            			"translation": [0, 0.75, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	},
            	"groups": [
            		{
            			"name": "bench",
            			"origin": [8, 8, 8],
            			"color": 0,
            			"children": [0, 1, 2, 3, 4, 5, 6, 7, 8]
            		}
            	]
            }
            """;

    public static final String SIMPLE_BENCH_LEFT_BACKREST_MODEL = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [64, 64],
            	"textures": {
            		"0": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE",
            		"particle": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE"
            	},
            	"elements": [
            		{
            			"from": [2, 0, 4.25],
            			"to": [4, 7.5, 6.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 3.75, 5.25]},
            			"faces": {
            				"north": {"uv": [4.5, 0.5, 5, 2.5], "texture": "#0"},
            				"east": {"uv": [1, 4.5, 1.5, 6.5], "texture": "#0"},
            				"south": {"uv": [1.5, 4.5, 2, 6.5], "texture": "#0"},
            				"west": {"uv": [2, 4.5, 2.5, 6.5], "texture": "#0"},
            				"up": {"uv": [6.5, 4.5, 6, 4], "texture": "#0"},
            				"down": {"uv": [6.5, 4.5, 6, 5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2, 0, 9.75],
            			"to": [4, 7.5, 11.75],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 3.75, 10.75]},
            			"faces": {
            				"north": {"uv": [5.5, 0.5, 6, 2.5], "texture": "#0"},
            				"east": {"uv": [5.5, 2.5, 6, 4.5], "texture": "#0"},
            				"south": {"uv": [4, 5.5, 4.5, 7.5], "texture": "#0"},
            				"west": {"uv": [5.5, 4.5, 6, 6.5], "texture": "#0"},
            				"up": {"uv": [2, 7, 1.5, 6.5], "texture": "#0"},
            				"down": {"uv": [2.5, 6.5, 2, 7], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 8, 11.6],
            			"to": [16, 9, 13.4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 12.5]},
            			"faces": {
            				"north": {"uv": [6, 0.5, 10, 0.75], "texture": "#0"},
            				"east": {"uv": [2.5, 6.5, 3, 6.75], "texture": "#0"},
            				"south": {"uv": [6, 0.75, 10, 1], "texture": "#0"},
            				"west": {"uv": [3, 6.5, 3.5, 6.75], "texture": "#0"},
            				"up": {"uv": [4, 0.5, 0, 0], "texture": "#0"},
            				"down": {"uv": [4, 0.5, 0, 1], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 8, 9.35],
            			"to": [16, 9, 11.15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 10.25]},
            			"faces": {
            				"north": {"uv": [6, 1, 10, 1.25], "texture": "#0"},
            				"east": {"uv": [3.5, 6.5, 4, 6.75], "texture": "#0"},
            				"south": {"uv": [6, 1.25, 10, 1.5], "texture": "#0"},
            				"west": {"uv": [6.5, 4, 7, 4.25], "texture": "#0"},
            				"up": {"uv": [4, 1.5, 0, 1], "texture": "#0"},
            				"down": {"uv": [4, 1.5, 0, 2], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 8, 7.1],
            			"to": [16, 9, 8.9],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 8]},
            			"faces": {
            				"north": {"uv": [6, 1.5, 10, 1.75], "texture": "#0"},
            				"east": {"uv": [6.5, 4.25, 7, 4.5], "texture": "#0"},
            				"south": {"uv": [6, 1.75, 10, 2], "texture": "#0"},
            				"west": {"uv": [4.5, 6.5, 5, 6.75], "texture": "#0"},
            				"up": {"uv": [4, 2.5, 0, 2], "texture": "#0"},
            				"down": {"uv": [4, 2.5, 0, 3], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 8, 4.85],
            			"to": [16, 9, 6.65],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 5.75]},
            			"faces": {
            				"north": {"uv": [6, 2, 10, 2.25], "texture": "#0"},
            				"east": {"uv": [6.5, 4.5, 7, 4.75], "texture": "#0"},
            				"south": {"uv": [6, 2.25, 10, 2.5], "texture": "#0"},
            				"west": {"uv": [6.5, 4.75, 7, 5], "texture": "#0"},
            				"up": {"uv": [4, 3.5, 0, 3], "texture": "#0"},
            				"down": {"uv": [4, 3.5, 0, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 8, 2.6],
            			"to": [16, 9, 4.4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 3.5]},
            			"faces": {
            				"north": {"uv": [6, 2.5, 10, 2.75], "texture": "#0"},
            				"east": {"uv": [5, 6.5, 5.5, 6.75], "texture": "#0"},
            				"south": {"uv": [6, 2.75, 10, 3], "texture": "#0"},
            				"west": {"uv": [6.5, 5, 7, 5.25], "texture": "#0"},
            				"up": {"uv": [4, 4.5, 0, 4], "texture": "#0"},
            				"down": {"uv": [8, 0, 4, 0.5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [1.8, 7.5, 2.8],
            			"to": [4.2, 8, 13.2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 7.75, 8]},
            			"faces": {
            				"north": {"uv": [6.5, 5.25, 7, 5.5], "texture": "#0"},
            				"east": {"uv": [6, 3, 8.5, 3.25], "texture": "#0"},
            				"south": {"uv": [5.5, 6.5, 6, 6.75], "texture": "#0"},
            				"west": {"uv": [6, 3.25, 8.5, 3.5], "texture": "#0"},
            				"up": {"uv": [4.5, 3, 4, 0.5], "texture": "#0"},
            				"down": {"uv": [4.5, 3, 4, 5.5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2.7, 9, 3.2],
            			"to": [3.3, 9.15, 3.8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 9.125, 3.5]},
            			"faces": {
            				"north": {"uv": [6, 6.5, 6.25, 6.75], "texture": "#0"},
            				"east": {"uv": [6.5, 6, 6.75, 6.25], "texture": "#0"},
            				"south": {"uv": [6.25, 6.5, 6.5, 6.75], "texture": "#0"},
            				"west": {"uv": [6.5, 6.25, 6.75, 6.5], "texture": "#0"},
            				"up": {"uv": [6.75, 6.75, 6.5, 6.5], "texture": "#0"},
            				"down": {"uv": [2.75, 6.75, 2.5, 7], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2.7, 9, 5.45],
            			"to": [3.3, 9.15, 6.05],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 9.125, 5.75]},
            			"faces": {
            				"north": {"uv": [2.75, 6.75, 3, 7], "texture": "#0"},
            				"east": {"uv": [3, 6.75, 3.25, 7], "texture": "#0"},
            				"south": {"uv": [3.25, 6.75, 3.5, 7], "texture": "#0"},
            				"west": {"uv": [3.5, 6.75, 3.75, 7], "texture": "#0"},
            				"up": {"uv": [4, 7, 3.75, 6.75], "texture": "#0"},
            				"down": {"uv": [4.75, 6.75, 4.5, 7], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2.7, 9, 7.7],
            			"to": [3.3, 9.15, 8.3],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 9.125, 8]},
            			"faces": {
            				"north": {"uv": [4.75, 6.75, 5, 7], "texture": "#0"},
            				"east": {"uv": [5, 6.75, 5.25, 7], "texture": "#0"},
            				"south": {"uv": [5.25, 6.75, 5.5, 7], "texture": "#0"},
            				"west": {"uv": [5.5, 6.75, 5.75, 7], "texture": "#0"},
            				"up": {"uv": [6, 7, 5.75, 6.75], "texture": "#0"},
            				"down": {"uv": [6.25, 6.75, 6, 7], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2.7, 9, 9.95],
            			"to": [3.3, 9.15, 10.55],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 9.125, 10.25]},
            			"faces": {
            				"north": {"uv": [6.75, 6, 7, 6.25], "texture": "#0"},
            				"east": {"uv": [6.25, 6.75, 6.5, 7], "texture": "#0"},
            				"south": {"uv": [6.75, 6.25, 7, 6.5], "texture": "#0"},
            				"west": {"uv": [6.5, 6.75, 6.75, 7], "texture": "#0"},
            				"up": {"uv": [7, 6.75, 6.75, 6.5], "texture": "#0"},
            				"down": {"uv": [7, 6.75, 6.75, 7], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2.7, 9, 12.2],
            			"to": [3.3, 9.15, 12.8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 9.125, 12.5]},
            			"faces": {
            				"north": {"uv": [0, 7, 0.25, 7.25], "texture": "#0"},
            				"east": {"uv": [0.25, 7, 0.5, 7.25], "texture": "#0"},
            				"south": {"uv": [0.5, 7, 0.75, 7.25], "texture": "#0"},
            				"west": {"uv": [0.75, 7, 1, 7.25], "texture": "#0"},
            				"up": {"uv": [1.25, 7.25, 1, 7], "texture": "#0"},
            				"down": {"uv": [1.5, 7, 1.25, 7.25], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 11.1625, 0.4875],
            			"to": [16, 12.9625, 1.4875],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [4, 1.5, 0, 2], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [3.5, 6.5, 4, 6.75], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [4, 1.5, 0, 1], "texture": "#0"},
            				"west": {"uv": [6.5, 4, 7, 4.25], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [6, 1, 10, 1.25], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [6, 1.25, 10, 1.5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 13.4125, 0.4875],
            			"to": [16, 15.2125, 1.4875],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [4, 2.5, 0, 3], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [6.5, 4.25, 7, 4.5], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [4, 2.5, 0, 2], "texture": "#0"},
            				"west": {"uv": [4.5, 6.5, 5, 6.75], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [6, 1.5, 10, 1.75], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [6, 1.75, 10, 2], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 15.6625, 0.4875],
            			"to": [16, 17.4625, 1.4875],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [4, 3.5, 0, 4], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [6.5, 4.5, 7, 4.75], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [4, 3.5, 0, 3], "texture": "#0"},
            				"west": {"uv": [6.5, 4.75, 7, 5], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [6, 2, 10, 2.25], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [6, 2.25, 10, 2.5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 17.9125, 0.4875],
            			"to": [16, 19.7125, 1.4875],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [8, 0, 4, 0.5], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [5, 6.5, 5.5, 6.75], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [4, 4.5, 0, 4], "texture": "#0"},
            				"west": {"uv": [6.5, 5, 7, 5.25], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [6, 2.5, 10, 2.75], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [6, 2.75, 10, 3], "texture": "#0"}
            			}
            		},
            		{
            			"from": [1.9, 7.1125, -0.0125],
            			"to": [4.1, 19.5125, 0.4875],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [4.5, 3, 4, 5.5], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [6, 3, 8.5, 3.25], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [4.5, 3, 4, 0.5], "texture": "#0"},
            				"west": {"uv": [6, 3.25, 8.5, 3.5], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [6.5, 5.25, 7, 5.5], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [5.5, 6.5, 6, 6.75], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2.7, 18.5125, 1.4875],
            			"to": [3.3, 19.1125, 1.6375],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [2.75, 6.75, 2.5, 7], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [6.5, 6, 6.75, 6.25], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [6.75, 6.75, 6.5, 6.5], "texture": "#0"},
            				"west": {"uv": [6.5, 6.25, 6.75, 6.5], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [6, 6.5, 6.25, 6.75], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [6.25, 6.5, 6.5, 6.75], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2.7, 16.2625, 1.4875],
            			"to": [3.3, 16.8625, 1.6375],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [4.75, 6.75, 4.5, 7], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [3, 6.75, 3.25, 7], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [4, 7, 3.75, 6.75], "texture": "#0"},
            				"west": {"uv": [3.5, 6.75, 3.75, 7], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [2.75, 6.75, 3, 7], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [3.25, 6.75, 3.5, 7], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2.7, 14.0125, 1.4875],
            			"to": [3.3, 14.6125, 1.6375],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [6.25, 6.75, 6, 7], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [5, 6.75, 5.25, 7], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [6, 7, 5.75, 6.75], "texture": "#0"},
            				"west": {"uv": [5.5, 6.75, 5.75, 7], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [4.75, 6.75, 5, 7], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [5.25, 6.75, 5.5, 7], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2.7, 11.7625, 1.4875],
            			"to": [3.3, 12.3625, 1.6375],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [7, 6.75, 6.75, 7], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [6.25, 6.75, 6.5, 7], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [7, 6.75, 6.75, 6.5], "texture": "#0"},
            				"west": {"uv": [6.5, 6.75, 6.75, 7], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [6.75, 6, 7, 6.25], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [6.75, 6.25, 7, 6.5], "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [2, 0.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [2, 0.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [2, 0.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [2, 0.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, 45, 0],
            			"translation": [0, 0.75, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	},
            	"groups": [
            		{
            			"name": "bench",
            			"origin": [8, 8, 8],
            			"color": 0,
            			"children": [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21]
            		}
            	]
            }
            """;

    public static final String SIMPLE_BENCH_RIGHT_BACKREST_MODEL = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [64, 64],
            	"textures": {
            		"0": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE",
            		"particle": "aestheticseating:block/simple_bench_WOOD_NAME_VALUE"
            	},
            	"elements": [
            		{
            			"from": [12, 0, 4.25],
            			"to": [14, 7.5, 6.25],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 3.75, 5.25]},
            			"faces": {
            				"north": {"uv": [2.5, 4.5, 3, 6.5], "texture": "#0"},
            				"east": {"uv": [4.5, 2.5, 5, 4.5], "texture": "#0"},
            				"south": {"uv": [3, 4.5, 3.5, 6.5], "texture": "#0"},
            				"west": {"uv": [3.5, 4.5, 4, 6.5], "texture": "#0"},
            				"up": {"uv": [6.5, 5.5, 6, 5], "texture": "#0"},
            				"down": {"uv": [6.5, 5.5, 6, 6], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12, 0, 9.75],
            			"to": [14, 7.5, 11.75],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 3.75, 10.75]},
            			"faces": {
            				"north": {"uv": [4.5, 4.5, 5, 6.5], "texture": "#0"},
            				"east": {"uv": [5, 0.5, 5.5, 2.5], "texture": "#0"},
            				"south": {"uv": [5, 2.5, 5.5, 4.5], "texture": "#0"},
            				"west": {"uv": [5, 4.5, 5.5, 6.5], "texture": "#0"},
            				"up": {"uv": [6.5, 6.5, 6, 6], "texture": "#0"},
            				"down": {"uv": [1.5, 6.5, 1, 7], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 8, 11.6],
            			"to": [16, 9, 13.4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 12.5]},
            			"faces": {
            				"north": {"uv": [6, 0.5, 10, 0.75], "texture": "#0"},
            				"east": {"uv": [2.5, 6.5, 3, 6.75], "texture": "#0"},
            				"south": {"uv": [6, 0.75, 10, 1], "texture": "#0"},
            				"west": {"uv": [3, 6.5, 3.5, 6.75], "texture": "#0"},
            				"up": {"uv": [4, 0.5, 0, 0], "texture": "#0"},
            				"down": {"uv": [4, 0.5, 0, 1], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 8, 9.35],
            			"to": [16, 9, 11.15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 10.25]},
            			"faces": {
            				"north": {"uv": [6, 1, 10, 1.25], "texture": "#0"},
            				"east": {"uv": [3.5, 6.5, 4, 6.75], "texture": "#0"},
            				"south": {"uv": [6, 1.25, 10, 1.5], "texture": "#0"},
            				"west": {"uv": [6.5, 4, 7, 4.25], "texture": "#0"},
            				"up": {"uv": [4, 1.5, 0, 1], "texture": "#0"},
            				"down": {"uv": [4, 1.5, 0, 2], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 8, 7.1],
            			"to": [16, 9, 8.9],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 8]},
            			"faces": {
            				"north": {"uv": [6, 1.5, 10, 1.75], "texture": "#0"},
            				"east": {"uv": [6.5, 4.25, 7, 4.5], "texture": "#0"},
            				"south": {"uv": [6, 1.75, 10, 2], "texture": "#0"},
            				"west": {"uv": [4.5, 6.5, 5, 6.75], "texture": "#0"},
            				"up": {"uv": [4, 2.5, 0, 2], "texture": "#0"},
            				"down": {"uv": [4, 2.5, 0, 3], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 8, 4.85],
            			"to": [16, 9, 6.65],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 5.75]},
            			"faces": {
            				"north": {"uv": [6, 2, 10, 2.25], "texture": "#0"},
            				"east": {"uv": [6.5, 4.5, 7, 4.75], "texture": "#0"},
            				"south": {"uv": [6, 2.25, 10, 2.5], "texture": "#0"},
            				"west": {"uv": [6.5, 4.75, 7, 5], "texture": "#0"},
            				"up": {"uv": [4, 3.5, 0, 3], "texture": "#0"},
            				"down": {"uv": [4, 3.5, 0, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 8, 2.6],
            			"to": [16, 9, 4.4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 8.5, 3.5]},
            			"faces": {
            				"north": {"uv": [6, 2.5, 10, 2.75], "texture": "#0"},
            				"east": {"uv": [5, 6.5, 5.5, 6.75], "texture": "#0"},
            				"south": {"uv": [6, 2.75, 10, 3], "texture": "#0"},
            				"west": {"uv": [6.5, 5, 7, 5.25], "texture": "#0"},
            				"up": {"uv": [4, 4.5, 0, 4], "texture": "#0"},
            				"down": {"uv": [8, 0, 4, 0.5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [11.8, 7.5, 2.8],
            			"to": [14.2, 8, 13.2],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 7.75, 8]},
            			"faces": {
            				"north": {"uv": [6.5, 5.5, 7, 5.75], "texture": "#0"},
            				"east": {"uv": [6, 3.5, 8.5, 3.75], "texture": "#0"},
            				"south": {"uv": [6.5, 5.75, 7, 6], "texture": "#0"},
            				"west": {"uv": [6, 3.75, 8.5, 4], "texture": "#0"},
            				"up": {"uv": [0.5, 7, 0, 4.5], "texture": "#0"},
            				"down": {"uv": [1, 4.5, 0.5, 7], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12.7, 9, 3.2],
            			"to": [13.3, 9.15, 3.8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 9.125, 3.5]},
            			"faces": {
            				"north": {"uv": [1.5, 7, 1.75, 7.25], "texture": "#0"},
            				"east": {"uv": [1.75, 7, 2, 7.25], "texture": "#0"},
            				"south": {"uv": [2, 7, 2.25, 7.25], "texture": "#0"},
            				"west": {"uv": [2.25, 7, 2.5, 7.25], "texture": "#0"},
            				"up": {"uv": [2.75, 7.25, 2.5, 7], "texture": "#0"},
            				"down": {"uv": [3, 7, 2.75, 7.25], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12.7, 9, 5.45],
            			"to": [13.3, 9.15, 6.05],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 9.125, 5.75]},
            			"faces": {
            				"north": {"uv": [3, 7, 3.25, 7.25], "texture": "#0"},
            				"east": {"uv": [3.25, 7, 3.5, 7.25], "texture": "#0"},
            				"south": {"uv": [3.5, 7, 3.75, 7.25], "texture": "#0"},
            				"west": {"uv": [3.75, 7, 4, 7.25], "texture": "#0"},
            				"up": {"uv": [7.25, 4.25, 7, 4], "texture": "#0"},
            				"down": {"uv": [7.25, 4.25, 7, 4.5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12.7, 9, 7.7],
            			"to": [13.3, 9.15, 8.3],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 9.125, 8]},
            			"faces": {
            				"north": {"uv": [4.5, 7, 4.75, 7.25], "texture": "#0"},
            				"east": {"uv": [7, 4.5, 7.25, 4.75], "texture": "#0"},
            				"south": {"uv": [4.75, 7, 5, 7.25], "texture": "#0"},
            				"west": {"uv": [7, 4.75, 7.25, 5], "texture": "#0"},
            				"up": {"uv": [5.25, 7.25, 5, 7], "texture": "#0"},
            				"down": {"uv": [7.25, 5, 7, 5.25], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12.7, 9, 9.95],
            			"to": [13.3, 9.15, 10.55],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 9.125, 10.25]},
            			"faces": {
            				"north": {"uv": [5.25, 7, 5.5, 7.25], "texture": "#0"},
            				"east": {"uv": [7, 5.25, 7.25, 5.5], "texture": "#0"},
            				"south": {"uv": [5.5, 7, 5.75, 7.25], "texture": "#0"},
            				"west": {"uv": [7, 5.5, 7.25, 5.75], "texture": "#0"},
            				"up": {"uv": [6, 7.25, 5.75, 7], "texture": "#0"},
            				"down": {"uv": [7.25, 5.75, 7, 6], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12.7, 9, 12.2],
            			"to": [13.3, 9.15, 12.8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 9.125, 12.5]},
            			"faces": {
            				"north": {"uv": [6, 7, 6.25, 7.25], "texture": "#0"},
            				"east": {"uv": [7, 6, 7.25, 6.25], "texture": "#0"},
            				"south": {"uv": [6.25, 7, 6.5, 7.25], "texture": "#0"},
            				"west": {"uv": [7, 6.25, 7.25, 6.5], "texture": "#0"},
            				"up": {"uv": [6.75, 7.25, 6.5, 7], "texture": "#0"},
            				"down": {"uv": [7.25, 6.5, 7, 6.75], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 11.1625, 0.4875],
            			"to": [16, 12.9625, 1.4875],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [4, 1.5, 0, 2], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [3.5, 6.5, 4, 6.75], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [4, 1.5, 0, 1], "texture": "#0"},
            				"west": {"uv": [6.5, 4, 7, 4.25], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [6, 1, 10, 1.25], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [6, 1.25, 10, 1.5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 13.4125, 0.4875],
            			"to": [16, 15.2125, 1.4875],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [4, 2.5, 0, 3], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [6.5, 4.25, 7, 4.5], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [4, 2.5, 0, 2], "texture": "#0"},
            				"west": {"uv": [4.5, 6.5, 5, 6.75], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [6, 1.5, 10, 1.75], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [6, 1.75, 10, 2], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 15.6625, 0.4875],
            			"to": [16, 17.4625, 1.4875],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [4, 3.5, 0, 4], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [6.5, 4.5, 7, 4.75], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [4, 3.5, 0, 3], "texture": "#0"},
            				"west": {"uv": [6.5, 4.75, 7, 5], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [6, 2, 10, 2.25], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [6, 2.25, 10, 2.5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 17.9125, 0.4875],
            			"to": [16, 19.7125, 1.4875],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [8, 0, 4, 0.5], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [5, 6.5, 5.5, 6.75], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [4, 4.5, 0, 4], "texture": "#0"},
            				"west": {"uv": [6.5, 5, 7, 5.25], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [6, 2.5, 10, 2.75], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [6, 2.75, 10, 3], "texture": "#0"}
            			}
            		},
            		{
            			"from": [11.9, 7.1125, -0.0125],
            			"to": [14.1, 19.5125, 0.4875],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [1, 4.5, 0.5, 7], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [6, 3.5, 8.5, 3.75], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [0.5, 7, 0, 4.5], "texture": "#0"},
            				"west": {"uv": [6, 3.75, 8.5, 4], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [6.5, 5.5, 7, 5.75], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [6.5, 5.75, 7, 6], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12.7, 18.5125, 1.4875],
            			"to": [13.3, 19.1125, 1.6375],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [3, 7, 2.75, 7.25], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [1.75, 7, 2, 7.25], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [2.75, 7.25, 2.5, 7], "texture": "#0"},
            				"west": {"uv": [2.25, 7, 2.5, 7.25], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [1.5, 7, 1.75, 7.25], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [2, 7, 2.25, 7.25], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12.7, 16.2625, 1.4875],
            			"to": [13.3, 16.8625, 1.6375],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [7.25, 4.25, 7, 4.5], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [3.25, 7, 3.5, 7.25], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [7.25, 4.25, 7, 4], "texture": "#0"},
            				"west": {"uv": [3.75, 7, 4, 7.25], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [3, 7, 3.25, 7.25], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [3.5, 7, 3.75, 7.25], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12.7, 14.0125, 1.4875],
            			"to": [13.3, 14.6125, 1.6375],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [7.25, 5, 7, 5.25], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [7, 4.5, 7.25, 4.75], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [5.25, 7.25, 5, 7], "texture": "#0"},
            				"west": {"uv": [7, 4.75, 7.25, 5], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [4.5, 7, 4.75, 7.25], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [4.75, 7, 5, 7.25], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12.7, 11.7625, 1.4875],
            			"to": [13.3, 12.3625, 1.6375],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 14.3125, 0.9]},
            			"faces": {
            				"north": {"uv": [7.25, 5.75, 7, 6], "rotation": 180, "texture": "#0"},
            				"east": {"uv": [7, 5.25, 7.25, 5.5], "rotation": 270, "texture": "#0"},
            				"south": {"uv": [6, 7.25, 5.75, 7], "texture": "#0"},
            				"west": {"uv": [7, 5.5, 7.25, 5.75], "rotation": 90, "texture": "#0"},
            				"up": {"uv": [5.25, 7, 5.5, 7.25], "rotation": 180, "texture": "#0"},
            				"down": {"uv": [5.5, 7, 5.75, 7.25], "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [2, 0.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [2, 0.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [2, 0.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [2, 0.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, 45, 0],
            			"translation": [0, 0.75, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	},
            	"groups": [
            		{
            			"name": "bench",
            			"origin": [8, 8, 8],
            			"color": 0,
            			"children": [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21]
            		}
            	]
            }
            """;

    public static final String STONE_BENCH_NORMAL_MODEL = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [64, 64],
            	"textures": {
            		"0": "aestheticseating:block/stone_bench_STONE_NAME_VALUE",
            		"particle": "aestheticseating:block/stone_bench_STONE_NAME_VALUE"
            	},
            	"elements": [
            		{
            			"from": [14, 0, 2.98],
            			"to": [16, 8.72, 12.48],
            			"rotation": {"angle": 0, "axis": "y", "origin": [7.99975, 6.97625, 7.73536]},
            			"faces": {
            				"north": {"uv": [6, 5.5, 6.5, 7.75], "texture": "#0"},
            				"east": {"uv": [3, 0, 5.5, 2.25], "texture": "#0"},
            				"south": {"uv": [6.5, 0, 7, 2.25], "texture": "#0"},
            				"west": {"uv": [3, 2.25, 5.5, 4.5], "texture": "#0"},
            				"up": {"uv": [6, 2.5, 5.5, 0], "texture": "#0"},
            				"down": {"uv": [5.5, 5.5, 5, 8], "texture": "#0"}
            			}
            		},
            		{
            			"from": [14, 8.7, 4.75],
            			"to": [16, 10.485, 10.72],
            			"rotation": {"angle": 0, "axis": "y", "origin": [7.99975, 6.97625, 7.73536]},
            			"faces": {
            				"north": {"uv": [5.5, 4, 6, 4.5], "texture": "#0"},
            				"east": {"uv": [7, 0, 8.5, 0.5], "texture": "#0"},
            				"south": {"uv": [6, 4, 6.5, 4.5], "texture": "#0"},
            				"west": {"uv": [7, 0.5, 8.5, 1], "texture": "#0"},
            				"up": {"uv": [6, 4, 5.5, 2.5], "texture": "#0"},
            				"down": {"uv": [6.5, 2.5, 6, 4], "texture": "#0"}
            			}
            		},
            		{
            			"from": [13.999, 4.84629, 10.83088],
            			"to": [16.001, 7.34629, 12.33088],
            			"rotation": {"angle": -45, "axis": "x", "origin": [7.99975, 6.97625, 7.73536]},
            			"faces": {
            				"north": {"uv": [4, 7.25, 4.5, 7.75], "texture": "#0"},
            				"east": {"uv": [7.5, 2, 8, 2.5], "texture": "#0"},
            				"south": {"uv": [7.5, 2.5, 8, 3], "texture": "#0"},
            				"west": {"uv": [7.5, 3, 8, 3.5], "texture": "#0"},
            				"up": {"uv": [8, 4, 7.5, 3.5], "texture": "#0"},
            				"down": {"uv": [8, 4, 7.5, 4.5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [13.999, 4.84629, 3.13983],
            			"to": [16.001, 7.34629, 4.63983],
            			"rotation": {"angle": 45, "axis": "x", "origin": [7.99975, 6.97625, 7.73536]},
            			"faces": {
            				"north": {"uv": [7, 3.5, 7.5, 4.25], "texture": "#0"},
            				"east": {"uv": [7, 5.5, 7.5, 6.25], "texture": "#0"},
            				"south": {"uv": [7, 6.25, 7.5, 7], "texture": "#0"},
            				"west": {"uv": [7, 7, 7.5, 7.75], "texture": "#0"},
            				"up": {"uv": [8, 6, 7.5, 5.5], "texture": "#0"},
            				"down": {"uv": [8, 6, 7.5, 6.5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 0, 2.98],
            			"to": [2, 8.72, 12.48],
            			"rotation": {"angle": 0, "axis": "y", "origin": [7.99975, 6.97625, 7.73536]},
            			"faces": {
            				"north": {"uv": [6.5, 2.25, 7, 4.5], "texture": "#0"},
            				"east": {"uv": [0, 4.5, 2.5, 6.75], "texture": "#0"},
            				"south": {"uv": [6.5, 5.5, 7, 7.75], "texture": "#0"},
            				"west": {"uv": [2.5, 4.5, 5, 6.75], "texture": "#0"},
            				"up": {"uv": [6, 8, 5.5, 5.5], "texture": "#0"},
            				"down": {"uv": [6.5, 0, 6, 2.5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 8.7, 4.75],
            			"to": [2, 10.485, 10.72],
            			"rotation": {"angle": 0, "axis": "y", "origin": [7.99975, 6.97625, 7.73536]},
            			"faces": {
            				"north": {"uv": [7.5, 6.5, 8, 7], "texture": "#0"},
            				"east": {"uv": [7, 1, 8.5, 1.5], "texture": "#0"},
            				"south": {"uv": [7.5, 7, 8, 7.5], "texture": "#0"},
            				"west": {"uv": [7, 1.5, 8.5, 2], "texture": "#0"},
            				"up": {"uv": [5, 8.25, 4.5, 6.75], "texture": "#0"},
            				"down": {"uv": [7.5, 2, 7, 3.5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [-0.001, 4.84629, 10.83088],
            			"to": [2, 7.34629, 12.33088],
            			"rotation": {"angle": -45, "axis": "x", "origin": [7.99975, 6.97625, 7.73536]},
            			"faces": {
            				"north": {"uv": [0, 7.25, 0.5, 8], "texture": "#0"},
            				"east": {"uv": [0.5, 7.25, 1, 8], "texture": "#0"},
            				"south": {"uv": [1, 7.25, 1.5, 8], "texture": "#0"},
            				"west": {"uv": [1.5, 7.25, 2, 8], "texture": "#0"},
            				"up": {"uv": [8, 8, 7.5, 7.5], "texture": "#0"},
            				"down": {"uv": [4.5, 7.75, 4, 8.25], "texture": "#0"}
            			}
            		},
            		{
            			"from": [-0.001, 4.84629, 3.13983],
            			"to": [2, 7.34629, 4.63983],
            			"rotation": {"angle": 45, "axis": "x", "origin": [7.99975, 6.97625, 7.73536]},
            			"faces": {
            				"north": {"uv": [2, 7.25, 2.5, 8], "texture": "#0"},
            				"east": {"uv": [2.5, 7.25, 3, 8], "texture": "#0"},
            				"south": {"uv": [3, 7.25, 3.5, 8], "texture": "#0"},
            				"west": {"uv": [3.5, 7.25, 4, 8], "texture": "#0"},
            				"up": {"uv": [6.5, 8.25, 6, 7.75], "texture": "#0"},
            				"down": {"uv": [7, 7.75, 6.5, 8.25], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2, 7.5, 3.28],
            			"to": [14, 9, 12.18],
            			"rotation": {"angle": 0, "axis": "y", "origin": [7.99975, 6.97625, 7.73536]},
            			"faces": {
            				"north": {"uv": [5, 4.5, 8, 5], "texture": "#0"},
            				"east": {"uv": [0, 6.75, 2.25, 7.25], "texture": "#0"},
            				"south": {"uv": [5, 5, 8, 5.5], "texture": "#0"},
            				"west": {"uv": [2.25, 6.75, 4.5, 7.25], "texture": "#0"},
            				"up": {"uv": [3, 2.25, 0, 0], "texture": "#0"},
            				"down": {"uv": [3, 2.25, 0, 4.5], "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [1, 0.25, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [1, 0.25, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [1, 0.25, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [1, 0.25, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"ground": {
            			"translation": [0, 1.75, 0],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, 45, 0],
            			"translation": [0, 0.75, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"translation": [0, 0, 1],
            			"scale": [0.5, 0.5, 0.5]
            		}
            	},
            	"groups": [
            		{
            			"name": "bench",
            			"origin": [8, 8, 8],
            			"color": 0,
            			"children": [
            				{
            					"name": "side1",
            					"origin": [15, 8.25, 4.5],
            					"color": 0,
            					"children": [0, 1, 2, 3]
            				},
            				{
            					"name": "side2",
            					"origin": [15, 8.25, 4.5],
            					"color": 0,
            					"children": [4, 5, 6, 7]
            				},
            				8
            			]
            		}
            	]
            }
            """;

    public static final String STONE_BENCH_CENTER_MODEL = """
            {
             	"credit": "Made with Blockbench",
             	"texture_size": [64, 64],
             	"textures": {
             		"0": "aestheticseating:block/stone_bench_STONE_NAME_VALUE",
             		"particle": "aestheticseating:block/stone_bench_STONE_NAME_VALUE"
             	},
             	"elements": [
             		{
             			"from": [-0.1, 7.5, 3.28],
             			"to": [16, 9, 12.18],
             			"rotation": {"angle": 0, "axis": "y", "origin": [7.99975, 6.97625, 7.73536]},
             			"faces": {
             				"north": {"uv": [5, 4.5, 8, 5], "texture": "#0"},
             				"east": {"uv": [0, 6.75, 2.25, 7.25], "texture": "#0"},
             				"south": {"uv": [5, 5, 8, 5.5], "texture": "#0"},
             				"west": {"uv": [2.25, 6.75, 4.5, 7.25], "texture": "#0"},
             				"up": {"uv": [3, 2.25, 0, 0], "texture": "#0"},
             				"down": {"uv": [3, 2.25, 0, 4.5], "texture": "#0"}
             			}
             		}
             	],
             	"display": {
             		"thirdperson_righthand": {
             			"translation": [2, 0.75, 0],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"thirdperson_lefthand": {
             			"translation": [2, 0.75, 0],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"firstperson_righthand": {
             			"translation": [2, 0.75, 0],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"firstperson_lefthand": {
             			"translation": [2, 0.75, 0],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"ground": {
             			"translation": [0, 1.75, 0],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"gui": {
             			"rotation": [20, 45, 0],
             			"translation": [0, 0.75, 0],
             			"scale": [0.6, 0.6, 0.6]
             		},
             		"fixed": {
             			"translation": [0, 0, 1],
             			"scale": [0.5, 0.5, 0.5]
             		}
             	},
             	"groups": [
             		{
             			"name": "bench",
             			"origin": [8, 8, 8],
             			"color": 0,
             			"children": [
             				{
             					"name": "side1",
             					"origin": [15, 8.25, 4.5],
             					"color": 0,
             					"children": []
             				},
             				{
             					"name": "side2",
             					"origin": [15, 8.25, 4.5],
             					"color": 0,
             					"children": []
             				},
             				0
             			]
             		}
             	]
            }
            """;

    public static final String STONE_BENCH_LEFT_MODEL = """
            {
             	"credit": "Made with Blockbench",
             	"texture_size": [64, 64],
             	"textures": {
             		"0": "aestheticseating:block/stone_bench_STONE_NAME_VALUE",
             		"particle": "aestheticseating:block/stone_bench_STONE_NAME_VALUE"
             	},
             	"elements": [
             		{
             			"from": [0, 0, 2.98],
             			"to": [2, 8.72, 12.48],
             			"rotation": {"angle": 0, "axis": "y", "origin": [7.99975, 6.97625, 7.73536]},
             			"faces": {
             				"north": {"uv": [6.5, 2.25, 7, 4.5], "texture": "#0"},
             				"east": {"uv": [0, 4.5, 2.5, 6.75], "texture": "#0"},
             				"south": {"uv": [6.5, 5.5, 7, 7.75], "texture": "#0"},
             				"west": {"uv": [2.5, 4.5, 5, 6.75], "texture": "#0"},
             				"up": {"uv": [6, 8, 5.5, 5.5], "texture": "#0"},
             				"down": {"uv": [6.5, 0, 6, 2.5], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 8.7, 4.75],
             			"to": [2, 10.485, 10.72],
             			"rotation": {"angle": 0, "axis": "y", "origin": [7.99975, 6.97625, 7.73536]},
             			"faces": {
             				"north": {"uv": [7.5, 6.5, 8, 7], "texture": "#0"},
             				"east": {"uv": [7, 1, 8.5, 1.5], "texture": "#0"},
             				"south": {"uv": [7.5, 7, 8, 7.5], "texture": "#0"},
             				"west": {"uv": [7, 1.5, 8.5, 2], "texture": "#0"},
             				"up": {"uv": [5, 8.25, 4.5, 6.75], "texture": "#0"},
             				"down": {"uv": [7.5, 2, 7, 3.5], "texture": "#0"}
             			}
             		},
             		{
             			"from": [-0.001, 4.84629, 10.83088],
             			"to": [2, 7.34629, 12.33088],
             			"rotation": {"angle": -45, "axis": "x", "origin": [7.99975, 6.97625, 7.73536]},
             			"faces": {
             				"north": {"uv": [0, 7.25, 0.5, 8], "texture": "#0"},
             				"east": {"uv": [0.5, 7.25, 1, 8], "texture": "#0"},
             				"south": {"uv": [1, 7.25, 1.5, 8], "texture": "#0"},
             				"west": {"uv": [1.5, 7.25, 2, 8], "texture": "#0"},
             				"up": {"uv": [8, 8, 7.5, 7.5], "texture": "#0"},
             				"down": {"uv": [4.5, 7.75, 4, 8.25], "texture": "#0"}
             			}
             		},
             		{
             			"from": [-0.001, 4.84629, 3.13983],
             			"to": [2, 7.34629, 4.63983],
             			"rotation": {"angle": 45, "axis": "x", "origin": [7.99975, 6.97625, 7.73536]},
             			"faces": {
             				"north": {"uv": [2, 7.25, 2.5, 8], "texture": "#0"},
             				"east": {"uv": [2.5, 7.25, 3, 8], "texture": "#0"},
             				"south": {"uv": [3, 7.25, 3.5, 8], "texture": "#0"},
             				"west": {"uv": [3.5, 7.25, 4, 8], "texture": "#0"},
             				"up": {"uv": [6.5, 8.25, 6, 7.75], "texture": "#0"},
             				"down": {"uv": [7, 7.75, 6.5, 8.25], "texture": "#0"}
             			}
             		},
             		{
             			"from": [2, 7.5, 3.28],
             			"to": [16, 9, 12.18],
             			"rotation": {"angle": 0, "axis": "y", "origin": [7.99975, 6.97625, 7.73536]},
             			"faces": {
             				"north": {"uv": [5, 4.5, 8, 5], "texture": "#0"},
             				"east": {"uv": [0, 6.75, 2.25, 7.25], "texture": "#0"},
             				"south": {"uv": [5, 5, 8, 5.5], "texture": "#0"},
             				"west": {"uv": [2.25, 6.75, 4.5, 7.25], "texture": "#0"},
             				"up": {"uv": [3, 2.25, 0, 0], "texture": "#0"},
             				"down": {"uv": [3, 2.25, 0, 4.5], "texture": "#0"}
             			}
             		}
             	],
             	"display": {
             		"thirdperson_righthand": {
             			"translation": [2, 0.75, 0],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"thirdperson_lefthand": {
             			"translation": [2, 0.75, 0],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"firstperson_righthand": {
             			"translation": [2, 0.75, 0],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"firstperson_lefthand": {
             			"translation": [2, 0.75, 0],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"ground": {
             			"translation": [0, 1.75, 0],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"gui": {
             			"rotation": [20, 45, 0],
             			"translation": [0, 0.75, 0],
             			"scale": [0.6, 0.6, 0.6]
             		},
             		"fixed": {
             			"translation": [0, 0, 1],
             			"scale": [0.5, 0.5, 0.5]
             		}
             	},
             	"groups": [
             		{
             			"name": "bench",
             			"origin": [8, 8, 8],
             			"color": 0,
             			"children": [
             				{
             					"name": "side1",
             					"origin": [15, 8.25, 4.5],
             					"color": 0,
             					"children": []
             				},
             				{
             					"name": "side2",
             					"origin": [15, 8.25, 4.5],
             					"color": 0,
             					"children": [0, 1, 2, 3]
             				},
             				4
             			]
             		}
             	]
            }
            """;

    public static final String STONE_BENCH_RIGHT_MODEL = """
            {
             	"credit": "Made with Blockbench",
             	"texture_size": [64, 64],
             	"textures": {
             		"0": "aestheticseating:block/stone_bench_STONE_NAME_VALUE",
             		"particle": "aestheticseating:block/stone_bench_STONE_NAME_VALUE"
             	},
             	"elements": [
             		{
             			"from": [14, 0, 2.98],
             			"to": [16, 8.72, 12.48],
             			"rotation": {"angle": 0, "axis": "y", "origin": [7.99975, 6.97625, 7.73536]},
             			"faces": {
             				"north": {"uv": [6, 5.5, 6.5, 7.75], "texture": "#0"},
             				"east": {"uv": [3, 0, 5.5, 2.25], "texture": "#0"},
             				"south": {"uv": [6.5, 0, 7, 2.25], "texture": "#0"},
             				"west": {"uv": [3, 2.25, 5.5, 4.5], "texture": "#0"},
             				"up": {"uv": [6, 2.5, 5.5, 0], "texture": "#0"},
             				"down": {"uv": [5.5, 5.5, 5, 8], "texture": "#0"}
             			}
             		},
             		{
             			"from": [14, 8.7, 4.75],
             			"to": [16, 10.485, 10.72],
             			"rotation": {"angle": 0, "axis": "y", "origin": [7.99975, 6.97625, 7.73536]},
             			"faces": {
             				"north": {"uv": [5.5, 4, 6, 4.5], "texture": "#0"},
             				"east": {"uv": [7, 0, 8.5, 0.5], "texture": "#0"},
             				"south": {"uv": [6, 4, 6.5, 4.5], "texture": "#0"},
             				"west": {"uv": [7, 0.5, 8.5, 1], "texture": "#0"},
             				"up": {"uv": [6, 4, 5.5, 2.5], "texture": "#0"},
             				"down": {"uv": [6.5, 2.5, 6, 4], "texture": "#0"}
             			}
             		},
             		{
             			"from": [13.999, 4.84629, 10.83088],
             			"to": [16.001, 7.34629, 12.33088],
             			"rotation": {"angle": -45, "axis": "x", "origin": [7.99975, 6.97625, 7.73536]},
             			"faces": {
             				"north": {"uv": [4, 7.25, 4.5, 7.75], "texture": "#0"},
             				"east": {"uv": [7.5, 2, 8, 2.5], "texture": "#0"},
             				"south": {"uv": [7.5, 2.5, 8, 3], "texture": "#0"},
             				"west": {"uv": [7.5, 3, 8, 3.5], "texture": "#0"},
             				"up": {"uv": [8, 4, 7.5, 3.5], "texture": "#0"},
             				"down": {"uv": [8, 4, 7.5, 4.5], "texture": "#0"}
             			}
             		},
             		{
             			"from": [13.999, 4.84629, 3.13983],
             			"to": [16.001, 7.34629, 4.63983],
             			"rotation": {"angle": 45, "axis": "x", "origin": [7.99975, 6.97625, 7.73536]},
             			"faces": {
             				"north": {"uv": [7, 3.5, 7.5, 4.25], "texture": "#0"},
             				"east": {"uv": [7, 5.5, 7.5, 6.25], "texture": "#0"},
             				"south": {"uv": [7, 6.25, 7.5, 7], "texture": "#0"},
             				"west": {"uv": [7, 7, 7.5, 7.75], "texture": "#0"},
             				"up": {"uv": [8, 6, 7.5, 5.5], "texture": "#0"},
             				"down": {"uv": [8, 6, 7.5, 6.5], "texture": "#0"}
             			}
             		},
             		{
             			"from": [-0.1, 7.5, 3.28],
             			"to": [14, 9, 12.18],
             			"rotation": {"angle": 0, "axis": "y", "origin": [7.99975, 6.97625, 7.73536]},
             			"faces": {
             				"north": {"uv": [5, 4.5, 8, 5], "texture": "#0"},
             				"east": {"uv": [0, 6.75, 2.25, 7.25], "texture": "#0"},
             				"south": {"uv": [5, 5, 8, 5.5], "texture": "#0"},
             				"west": {"uv": [2.25, 6.75, 4.5, 7.25], "texture": "#0"},
             				"up": {"uv": [3, 2.25, 0, 0], "texture": "#0"},
             				"down": {"uv": [3, 2.25, 0, 4.5], "texture": "#0"}
             			}
             		}
             	],
             	"display": {
             		"thirdperson_righthand": {
             			"translation": [2, 0.75, 0],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"thirdperson_lefthand": {
             			"translation": [2, 0.75, 0],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"firstperson_righthand": {
             			"translation": [2, 0.75, 0],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"firstperson_lefthand": {
             			"translation": [2, 0.75, 0],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"ground": {
             			"translation": [0, 1.75, 0],
             			"scale": [0.5, 0.5, 0.5]
             		},
             		"gui": {
             			"rotation": [20, 45, 0],
             			"translation": [0, 0.75, 0],
             			"scale": [0.6, 0.6, 0.6]
             		},
             		"fixed": {
             			"translation": [0, 0, 1],
             			"scale": [0.5, 0.5, 0.5]
             		}
             	},
             	"groups": [
             		{
             			"name": "bench",
             			"origin": [8, 8, 8],
             			"color": 0,
             			"children": [
             				{
             					"name": "side1",
             					"origin": [15, 8.25, 4.5],
             					"color": 0,
             					"children": [0, 1, 2, 3]
             				},
             				{
             					"name": "side2",
             					"origin": [15, 8.25, 4.5],
             					"color": 0,
             					"children": []
             				},
             				4
             			]
             		}
             	]
            }
            """;

    public static final String SOFA_NORMAL_MODEL = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [64, 64],
            	"textures": {
            		"0": "aestheticseating:block/sofa_COLOR_NAME_VALUE",
            		"particle": "aestheticseating:block/sofa_COLOR_NAME_VALUE"
            	},
            	"elements": [
            		{
            			"from": [1, 2, 1],
            			"to": [15, 7, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0, 4, 0]},
            			"faces": {
            				"north": {"uv": [3.5, 4, 7, 5.25], "texture": "#0"},
            				"east": {"uv": [3.5, 5.25, 7, 6.5], "texture": "#0"},
            				"south": {"uv": [3.5, 6.5, 7, 7.75], "texture": "#0"},
            				"west": {"uv": [0, 7, 3.5, 8.25], "texture": "#0"},
            				"up": {"uv": [3.5, 3.5, 0, 0], "texture": "#0"},
            				"down": {"uv": [3.5, 3.5, 0, 7], "texture": "#0"}
            			}
            		},
            		{
            			"from": [1, 7, 1],
            			"to": [15, 15, 5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 11, 3]},
            			"faces": {
            				"north": {"uv": [3.5, 0, 7, 2], "texture": "#0"},
            				"east": {"uv": [8, 7.25, 9, 9.25], "texture": "#0"},
            				"south": {"uv": [3.5, 2, 7, 4], "texture": "#0"},
            				"west": {"uv": [0, 8.25, 1, 10.25], "texture": "#0"},
            				"up": {"uv": [10.5, 1, 7, 0], "texture": "#0"},
            				"down": {"uv": [10.5, 1, 7, 2], "texture": "#0"}
            			}
            		},
            		{
            			"from": [1.25, 7, 5],
            			"to": [4.75, 10.5, 14],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3.25, 9, 9.5]},
            			"faces": {
            				"north": {"uv": [1, 8.25, 2, 9.25], "texture": "#0"},
            				"east": {"uv": [7, 2, 9.25, 3], "texture": "#0"},
            				"south": {"uv": [2, 8.25, 3, 9.25], "texture": "#0"},
            				"west": {"uv": [7, 3, 9.25, 4], "texture": "#0"},
            				"up": {"uv": [8, 6.25, 7, 4], "texture": "#0"},
            				"down": {"uv": [8, 6.25, 7, 8.5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [11.25, 7, 5],
            			"to": [14.75, 10.5, 14],
            			"rotation": {"angle": 0, "axis": "y", "origin": [12.75, 9, 9.5]},
            			"faces": {
            				"north": {"uv": [6.75, 8.5, 7.75, 9.5], "texture": "#0"},
            				"east": {"uv": [3.5, 7.75, 5.75, 8.75], "texture": "#0"},
            				"south": {"uv": [3, 8.75, 4, 9.75], "texture": "#0"},
            				"west": {"uv": [8, 4, 10.25, 5], "texture": "#0"},
            				"up": {"uv": [6.75, 10, 5.75, 7.75], "texture": "#0"},
            				"down": {"uv": [9, 5, 8, 7.25], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2, 0, 2],
            			"to": [4, 2, 4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 1, 3]},
            			"faces": {
            				"north": {"uv": [3, 8.25, 3.5, 8.75], "texture": "#0"},
            				"east": {"uv": [4, 8.75, 4.5, 9.25], "texture": "#0"},
            				"south": {"uv": [4.5, 8.75, 5, 9.25], "texture": "#0"},
            				"west": {"uv": [5, 8.75, 5.5, 9.25], "texture": "#0"},
            				"up": {"uv": [9.5, 5.5, 9, 5], "texture": "#0"},
            				"down": {"uv": [9.5, 5.5, 9, 6], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12, 0, 2],
            			"to": [14, 2, 4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 1, 3]},
            			"faces": {
            				"north": {"uv": [9, 6, 9.5, 6.5], "texture": "#0"},
            				"east": {"uv": [9, 6.5, 9.5, 7], "texture": "#0"},
            				"south": {"uv": [9, 7, 9.5, 7.5], "texture": "#0"},
            				"west": {"uv": [9, 7.5, 9.5, 8], "texture": "#0"},
            				"up": {"uv": [9.5, 8.5, 9, 8], "texture": "#0"},
            				"down": {"uv": [9.5, 8.5, 9, 9], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12, 0, 12],
            			"to": [14, 2, 14],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 1, 13]},
            			"faces": {
            				"north": {"uv": [9, 9, 9.5, 9.5], "texture": "#0"},
            				"east": {"uv": [1, 9.25, 1.5, 9.75], "texture": "#0"},
            				"south": {"uv": [1.5, 9.25, 2, 9.75], "texture": "#0"},
            				"west": {"uv": [2, 9.25, 2.5, 9.75], "texture": "#0"},
            				"up": {"uv": [9.75, 2.5, 9.25, 2], "texture": "#0"},
            				"down": {"uv": [3, 9.25, 2.5, 9.75], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2, 0, 12],
            			"to": [4, 2, 14],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 1, 13]},
            			"faces": {
            				"north": {"uv": [9.25, 2.5, 9.75, 3], "texture": "#0"},
            				"east": {"uv": [9.25, 3, 9.75, 3.5], "texture": "#0"},
            				"south": {"uv": [9.25, 3.5, 9.75, 4], "texture": "#0"},
            				"west": {"uv": [4, 9.25, 4.5, 9.75], "texture": "#0"},
            				"up": {"uv": [5, 9.75, 4.5, 9.25], "texture": "#0"},
            				"down": {"uv": [5.5, 9.25, 5, 9.75], "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [3.5, 4, -1.5],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"thirdperson_lefthand": {
            			"translation": [3.5, 4, -1.5],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_righthand": {
            			"translation": [3.5, 4, -1.5],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_lefthand": {
            			"translation": [3.5, 4, -1.5],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.4, 0.4, 0.4]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [0, 0.25, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"rotation": [0, 90, 0],
            			"translation": [0, 0, 0.75],
            			"scale": [0.6, 0.6, 0.6]
            		}
            	},
            	"groups": [
            		{
            			"name": "sofa",
            			"origin": [8, 8, 8],
            			"color": 0,
            			"children": [0, 1, 2, 3, 4, 5, 6, 7]
            		}
            	]
            }
            """;

    public static final String SOFA_CENTER_MODEL = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [64, 64],
            	"textures": {
            		"0": "aestheticseating:block/sofa_COLOR_NAME_VALUE",
            		"particle": "aestheticseating:block/sofa_COLOR_NAME_VALUE"
            	},
            	"elements": [
            		{
            			"from": [0, 2, 1],
            			"to": [16, 7, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0, 4, 0]},
            			"faces": {
            				"north": {"uv": [3.5, 4, 7, 5.25], "texture": "#0"},
            				"east": {"uv": [3.5, 5.25, 7, 6.5], "texture": "#0"},
            				"south": {"uv": [3.5, 6.5, 7, 7.75], "texture": "#0"},
            				"west": {"uv": [0, 7, 3.5, 8.25], "texture": "#0"},
            				"up": {"uv": [3.5, 3.5, 0, 0], "texture": "#0"},
            				"down": {"uv": [3.5, 3.5, 0, 7], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 7, 1],
            			"to": [16, 15, 5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 11, 3]},
            			"faces": {
            				"north": {"uv": [3.5, 0, 7, 2], "texture": "#0"},
            				"east": {"uv": [8, 7.25, 9, 9.25], "texture": "#0"},
            				"south": {"uv": [3.5, 2, 7, 4], "texture": "#0"},
            				"west": {"uv": [0, 8.25, 1, 10.25], "texture": "#0"},
            				"up": {"uv": [10.5, 1, 7, 0], "texture": "#0"},
            				"down": {"uv": [10.5, 1, 7, 2], "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [3.5, 4, -1.5],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"thirdperson_lefthand": {
            			"translation": [3.5, 4, -1.5],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_righthand": {
            			"translation": [3.5, 4, -1.5],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_lefthand": {
            			"translation": [3.5, 4, -1.5],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.4, 0.4, 0.4]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [0, 0.25, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"rotation": [0, 90, 0],
            			"translation": [0, 0, 0.75],
            			"scale": [0.6, 0.6, 0.6]
            		}
            	},
            	"groups": [
            		{
            			"name": "sofa",
            			"origin": [8, 8, 8],
            			"color": 0,
            			"children": [0, 1]
            		}
            	]
            }
            """;

    public static final String SOFA_LEFT_MODEL = """
            {
             	"credit": "Made with Blockbench",
             	"texture_size": [64, 64],
             	"textures": {
             		"0": "aestheticseating:block/sofa_COLOR_NAME_VALUE",
             		"particle": "aestheticseating:block/sofa_COLOR_NAME_VALUE"
             	},
             	"elements": [
             		{
             			"from": [0, 2, 1],
             			"to": [16, 7, 15],
             			"rotation": {"angle": 0, "axis": "y", "origin": [-1, 4, 0]},
             			"faces": {
             				"north": {"uv": [3.5, 4, 7, 5.25], "texture": "#0"},
             				"east": {"uv": [3.5, 5.25, 7, 6.5], "texture": "#0"},
             				"south": {"uv": [3.5, 6.5, 7, 7.75], "texture": "#0"},
             				"west": {"uv": [0, 7, 3.5, 8.25], "texture": "#0"},
             				"up": {"uv": [3.5, 3.5, 0, 0], "texture": "#0"},
             				"down": {"uv": [3.5, 3.5, 0, 7], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 7, 1],
             			"to": [16, 15, 5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [7, 11, 3]},
             			"faces": {
             				"north": {"uv": [3.5, 0, 7, 2], "texture": "#0"},
             				"east": {"uv": [8, 7.25, 9, 9.25], "texture": "#0"},
             				"south": {"uv": [3.5, 2, 7, 4], "texture": "#0"},
             				"west": {"uv": [0, 8.25, 1, 10.25], "texture": "#0"},
             				"up": {"uv": [10.5, 1, 7, 0], "texture": "#0"},
             				"down": {"uv": [10.5, 1, 7, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0.25, 7, 5],
             			"to": [3.75, 10.5, 14],
             			"rotation": {"angle": 0, "axis": "y", "origin": [2.25, 9, 9.5]},
             			"faces": {
             				"north": {"uv": [1, 8.25, 2, 9.25], "texture": "#0"},
             				"east": {"uv": [7, 2, 9.25, 3], "texture": "#0"},
             				"south": {"uv": [2, 8.25, 3, 9.25], "texture": "#0"},
             				"west": {"uv": [7, 3, 9.25, 4], "texture": "#0"},
             				"up": {"uv": [8, 6.25, 7, 4], "texture": "#0"},
             				"down": {"uv": [8, 6.25, 7, 8.5], "texture": "#0"}
             			}
             		},
             		{
             			"from": [1, 0, 2],
             			"to": [3, 2, 4],
             			"rotation": {"angle": 0, "axis": "y", "origin": [2, 1, 3]},
             			"faces": {
             				"north": {"uv": [3, 8.25, 3.5, 8.75], "texture": "#0"},
             				"east": {"uv": [4, 8.75, 4.5, 9.25], "texture": "#0"},
             				"south": {"uv": [4.5, 8.75, 5, 9.25], "texture": "#0"},
             				"west": {"uv": [5, 8.75, 5.5, 9.25], "texture": "#0"},
             				"up": {"uv": [9.5, 5.5, 9, 5], "texture": "#0"},
             				"down": {"uv": [9.5, 5.5, 9, 6], "texture": "#0"}
             			}
             		},
             		{
             			"from": [1, 0, 12],
             			"to": [3, 2, 14],
             			"rotation": {"angle": 0, "axis": "y", "origin": [2, 1, 13]},
             			"faces": {
             				"north": {"uv": [9.25, 2.5, 9.75, 3], "texture": "#0"},
             				"east": {"uv": [9.25, 3, 9.75, 3.5], "texture": "#0"},
             				"south": {"uv": [9.25, 3.5, 9.75, 4], "texture": "#0"},
             				"west": {"uv": [4, 9.25, 4.5, 9.75], "texture": "#0"},
             				"up": {"uv": [5, 9.75, 4.5, 9.25], "texture": "#0"},
             				"down": {"uv": [5.5, 9.25, 5, 9.75], "texture": "#0"}
             			}
             		}
             	],
             	"display": {
             		"thirdperson_righthand": {
             			"translation": [3.5, 4, -1.5],
             			"scale": [0.7, 0.7, 0.7]
             		},
             		"thirdperson_lefthand": {
             			"translation": [3.5, 4, -1.5],
             			"scale": [0.7, 0.7, 0.7]
             		},
             		"firstperson_righthand": {
             			"translation": [3.5, 4, -1.5],
             			"scale": [0.7, 0.7, 0.7]
             		},
             		"firstperson_lefthand": {
             			"translation": [3.5, 4, -1.5],
             			"scale": [0.7, 0.7, 0.7]
             		},
             		"ground": {
             			"translation": [0, 1.5, 0],
             			"scale": [0.4, 0.4, 0.4]
             		},
             		"gui": {
             			"rotation": [20, -45, 0],
             			"translation": [0, 0.25, 0],
             			"scale": [0.6, 0.6, 0.6]
             		},
             		"fixed": {
             			"rotation": [0, 90, 0],
             			"translation": [0, 0, 0.75],
             			"scale": [0.6, 0.6, 0.6]
             		}
             	},
             	"groups": [
             		{
             			"name": "sofa",
             			"origin": [8, 8, 8],
             			"color": 0,
             			"children": [0, 1, 2, 3, 4]
             		}
             	]
            }
            """;

    public static final String SOFA_RIGHT_MODEL = """
            {
             	"credit": "Made with Blockbench",
             	"texture_size": [64, 64],
             	"textures": {
             		"0": "aestheticseating:block/sofa_COLOR_NAME_VALUE",
             		"particle": "aestheticseating:block/sofa_COLOR_NAME_VALUE"
             	},
             	"elements": [
             		{
             			"from": [0, 2, 1],
             			"to": [16, 7, 15],
             			"rotation": {"angle": 0, "axis": "y", "origin": [1, 4, 0]},
             			"faces": {
             				"north": {"uv": [3.5, 4, 7, 5.25], "texture": "#0"},
             				"east": {"uv": [3.5, 5.25, 7, 6.5], "texture": "#0"},
             				"south": {"uv": [3.5, 6.5, 7, 7.75], "texture": "#0"},
             				"west": {"uv": [0, 7, 3.5, 8.25], "texture": "#0"},
             				"up": {"uv": [3.5, 3.5, 0, 0], "texture": "#0"},
             				"down": {"uv": [3.5, 3.5, 0, 7], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 7, 1],
             			"to": [16, 15, 5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [9, 11, 3]},
             			"faces": {
             				"north": {"uv": [3.5, 0, 7, 2], "texture": "#0"},
             				"east": {"uv": [8, 7.25, 9, 9.25], "texture": "#0"},
             				"south": {"uv": [3.5, 2, 7, 4], "texture": "#0"},
             				"west": {"uv": [0, 8.25, 1, 10.25], "texture": "#0"},
             				"up": {"uv": [10.5, 1, 7, 0], "texture": "#0"},
             				"down": {"uv": [10.5, 1, 7, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [12.25, 7, 5],
             			"to": [15.75, 10.5, 14],
             			"rotation": {"angle": 0, "axis": "y", "origin": [13.75, 9, 9.5]},
             			"faces": {
             				"north": {"uv": [6.75, 8.5, 7.75, 9.5], "texture": "#0"},
             				"east": {"uv": [3.5, 7.75, 5.75, 8.75], "texture": "#0"},
             				"south": {"uv": [3, 8.75, 4, 9.75], "texture": "#0"},
             				"west": {"uv": [8, 4, 10.25, 5], "texture": "#0"},
             				"up": {"uv": [6.75, 10, 5.75, 7.75], "texture": "#0"},
             				"down": {"uv": [9, 5, 8, 7.25], "texture": "#0"}
             			}
             		},
             		{
             			"from": [13, 0, 2],
             			"to": [15, 2, 4],
             			"rotation": {"angle": 0, "axis": "y", "origin": [14, 1, 3]},
             			"faces": {
             				"north": {"uv": [9, 6, 9.5, 6.5], "texture": "#0"},
             				"east": {"uv": [9, 6.5, 9.5, 7], "texture": "#0"},
             				"south": {"uv": [9, 7, 9.5, 7.5], "texture": "#0"},
             				"west": {"uv": [9, 7.5, 9.5, 8], "texture": "#0"},
             				"up": {"uv": [9.5, 8.5, 9, 8], "texture": "#0"},
             				"down": {"uv": [9.5, 8.5, 9, 9], "texture": "#0"}
             			}
             		},
             		{
             			"from": [13, 0, 12],
             			"to": [15, 2, 14],
             			"rotation": {"angle": 0, "axis": "y", "origin": [14, 1, 13]},
             			"faces": {
             				"north": {"uv": [9, 9, 9.5, 9.5], "texture": "#0"},
             				"east": {"uv": [1, 9.25, 1.5, 9.75], "texture": "#0"},
             				"south": {"uv": [1.5, 9.25, 2, 9.75], "texture": "#0"},
             				"west": {"uv": [2, 9.25, 2.5, 9.75], "texture": "#0"},
             				"up": {"uv": [9.75, 2.5, 9.25, 2], "texture": "#0"},
             				"down": {"uv": [3, 9.25, 2.5, 9.75], "texture": "#0"}
             			}
             		}
             	],
             	"display": {
             		"thirdperson_righthand": {
             			"translation": [3.5, 4, -1.5],
             			"scale": [0.7, 0.7, 0.7]
             		},
             		"thirdperson_lefthand": {
             			"translation": [3.5, 4, -1.5],
             			"scale": [0.7, 0.7, 0.7]
             		},
             		"firstperson_righthand": {
             			"translation": [3.5, 4, -1.5],
             			"scale": [0.7, 0.7, 0.7]
             		},
             		"firstperson_lefthand": {
             			"translation": [3.5, 4, -1.5],
             			"scale": [0.7, 0.7, 0.7]
             		},
             		"ground": {
             			"translation": [0, 1.5, 0],
             			"scale": [0.4, 0.4, 0.4]
             		},
             		"gui": {
             			"rotation": [20, -45, 0],
             			"translation": [0, 0.25, 0],
             			"scale": [0.6, 0.6, 0.6]
             		},
             		"fixed": {
             			"rotation": [0, 90, 0],
             			"translation": [0, 0, 0.75],
             			"scale": [0.6, 0.6, 0.6]
             		}
             	},
             	"groups": [
             		{
             			"name": "sofa",
             			"origin": [8, 8, 8],
             			"color": 0,
             			"children": [0, 1, 2, 3, 4]
             		}
             	]
            }
            """;

    public static final String SOFA_LEFTCORNER_MODEL = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [64, 64],
            	"textures": {
            		"0": "aestheticseating:block/sofa_COLOR_NAME_VALUE",
            		"particle": "aestheticseating:block/sofa_COLOR_NAME_VALUE"
            	},
            	"elements": [
            		{
            			"from": [1, 2, 1],
            			"to": [15, 7, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0, 4, 0]},
            			"faces": {
            				"north": {"uv": [3.5, 4, 7, 5.25], "texture": "#0"},
            				"east": {"uv": [3.5, 5.25, 7, 6.5], "texture": "#0"},
            				"south": {"uv": [3.5, 6.5, 7, 7.75], "texture": "#0"},
            				"west": {"uv": [0, 7, 3.5, 8.25], "texture": "#0"},
            				"up": {"uv": [3.5, 3.5, 0, 0], "texture": "#0"},
            				"down": {"uv": [3.5, 3.5, 0, 7], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2, 2.0025, 1.001],
            			"to": [16, 6.9975, 15.002],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1, 4, 0.1]},
            			"faces": {
            				"north": {"uv": [3.5, 4, 7, 5.25], "texture": "#0"},
            				"east": {"uv": [3.5, 5.25, 7, 6.5], "texture": "#0"},
            				"south": {"uv": [3.5, 6.5, 7, 7.75], "texture": "#0"},
            				"west": {"uv": [0, 7, 3.5, 8.25], "texture": "#0"},
            				"up": {"uv": [3.5, 3.5, 0, 0], "texture": "#0"},
            				"down": {"uv": [3.5, 3.5, 0, 7], "texture": "#0"}
            			}
            		},
            		{
            			"from": [1, 7, 1],
            			"to": [16, 15, 5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 11, 3]},
            			"faces": {
            				"north": {"uv": [3.5, 0, 7, 2], "texture": "#0"},
            				"east": {"uv": [8, 7.25, 9, 9.25], "texture": "#0"},
            				"south": {"uv": [3.5, 2, 7, 4], "texture": "#0"},
            				"west": {"uv": [0, 8.25, 1, 10.25], "texture": "#0"},
            				"up": {"uv": [10.5, 1, 7, 0], "texture": "#0"},
            				"down": {"uv": [10.5, 1, 7, 2], "texture": "#0"}
            			}
            		},
            		{
            			"from": [1, 11, 5],
            			"to": [5, 15, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [2.95, 13.5, 9.5]},
            			"faces": {
            				"north": {"uv": [1, 8.25, 2, 9.25], "texture": "#0"},
            				"east": {"uv": [7, 2, 9.25, 3], "texture": "#0"},
            				"south": {"uv": [2, 8.25, 3, 9.25], "texture": "#0"},
            				"west": {"uv": [7, 3, 9.25, 4], "texture": "#0"},
            				"up": {"uv": [8, 6.25, 7, 4], "texture": "#0"},
            				"down": {"uv": [8, 6.25, 7, 8.5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [1, 7, 5],
            			"to": [5, 11, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [2.25, 9, 9.5]},
            			"faces": {
            				"north": {"uv": [6.75, 8.5, 7.75, 9.5], "texture": "#0"},
            				"east": {"uv": [3.5, 7.75, 5.75, 8.75], "texture": "#0"},
            				"south": {"uv": [3, 8.75, 4, 9.75], "texture": "#0"},
            				"west": {"uv": [8, 4, 10.25, 5], "texture": "#0"},
            				"up": {"uv": [6.75, 10, 5.75, 7.75], "texture": "#0"},
            				"down": {"uv": [9, 5, 8, 7.25], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2, 0, 2],
            			"to": [4, 2, 4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 1, 3]},
            			"faces": {
            				"north": {"uv": [3, 8.25, 3.5, 8.75], "texture": "#0"},
            				"east": {"uv": [4, 8.75, 4.5, 9.25], "texture": "#0"},
            				"south": {"uv": [4.5, 8.75, 5, 9.25], "texture": "#0"},
            				"west": {"uv": [5, 8.75, 5.5, 9.25], "texture": "#0"},
            				"up": {"uv": [9.5, 5.5, 9, 5], "texture": "#0"},
            				"down": {"uv": [9.5, 5.5, 9, 6], "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [3.5, 4, -1.5],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"thirdperson_lefthand": {
            			"translation": [3.5, 4, -1.5],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_righthand": {
            			"translation": [3.5, 4, -1.5],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_lefthand": {
            			"translation": [3.5, 4, -1.5],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.4, 0.4, 0.4]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [0, 0.25, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"rotation": [0, 90, 0],
            			"translation": [0, 0, 0.75],
            			"scale": [0.6, 0.6, 0.6]
            		}
            	},
            	"groups": [
            		{
            			"name": "sofa",
            			"origin": [8, 8, 8],
            			"color": 0,
            			"children": [0, 1, 2, 3, 4, 5]
            		}
            	]
            }
            """;

    public static final String SOFA_RIGHTCORNER_MODEL = """
            {
              	"credit": "Made with Blockbench",
              	"texture_size": [64, 64],
              	"textures": {
              		"0": "aestheticseating:block/sofa_COLOR_NAME_VALUE",
              		"particle": "aestheticseating:block/sofa_COLOR_NAME_VALUE"
              	},
              	"elements": [
              		{
              			"from": [1, 2, 1.001],
              			"to": [15, 7, 16.001],
              			"rotation": {"angle": 0, "axis": "y", "origin": [0, 4, 0]},
              			"faces": {
              				"north": {"uv": [3.5, 4, 7, 5.25], "texture": "#0"},
              				"east": {"uv": [3.5, 5.25, 7, 6.5], "texture": "#0"},
              				"south": {"uv": [3.5, 6.5, 7, 7.75], "texture": "#0"},
              				"west": {"uv": [0, 7, 3.5, 8.25], "texture": "#0"},
              				"up": {"uv": [3.5, 3.5, 0, 0], "texture": "#0"},
              				"down": {"uv": [3.5, 3.5, 0, 7], "texture": "#0"}
              			}
              		},
              		{
              			"from": [0, 2.0025, 1],
              			"to": [14, 6.9975, 15],
              			"rotation": {"angle": 0, "axis": "y", "origin": [-1, 4.1, 0]},
              			"faces": {
              				"north": {"uv": [3.5, 4, 7, 5.25], "texture": "#0"},
              				"east": {"uv": [3.5, 5.25, 7, 6.5], "texture": "#0"},
              				"south": {"uv": [3.5, 6.5, 7, 7.75], "texture": "#0"},
              				"west": {"uv": [0, 7, 3.5, 8.25], "texture": "#0"},
              				"up": {"uv": [3.5, 3.5, 0, 0], "texture": "#0"},
              				"down": {"uv": [3.5, 3.5, 0, 7], "texture": "#0"}
              			}
              		},
              		{
              			"from": [0, 7, 1],
              			"to": [15, 15, 5],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 11, 3]},
              			"faces": {
              				"north": {"uv": [3.5, 0, 7, 2], "texture": "#0"},
              				"east": {"uv": [8, 7.25, 9, 9.25], "texture": "#0"},
              				"south": {"uv": [3.5, 2, 7, 4], "texture": "#0"},
              				"west": {"uv": [0, 8.25, 1, 10.25], "texture": "#0"},
              				"up": {"uv": [10.5, 1, 7, 0], "texture": "#0"},
              				"down": {"uv": [10.5, 1, 7, 2], "texture": "#0"}
              			}
              		},
              		{
              			"from": [11, 11, 5],
              			"to": [15, 15, 16],
              			"rotation": {"angle": 0, "axis": "y", "origin": [13.45, 13.5, 9.5]},
              			"faces": {
              				"north": {"uv": [1, 8.25, 2, 9.25], "texture": "#0"},
              				"east": {"uv": [7, 2, 9.25, 3], "texture": "#0"},
              				"south": {"uv": [2, 8.25, 3, 9.25], "texture": "#0"},
              				"west": {"uv": [7, 3, 9.25, 4], "texture": "#0"},
              				"up": {"uv": [8, 6.25, 7, 4], "texture": "#0"},
              				"down": {"uv": [8, 6.25, 7, 8.5], "texture": "#0"}
              			}
              		},
              		{
              			"from": [11, 7, 5],
              			"to": [15, 11, 16],
              			"rotation": {"angle": 0, "axis": "y", "origin": [12.75, 9, 9.5]},
              			"faces": {
              				"north": {"uv": [6.75, 8.5, 7.75, 9.5], "texture": "#0"},
              				"east": {"uv": [3.5, 7.75, 5.75, 8.75], "texture": "#0"},
              				"south": {"uv": [3, 8.75, 4, 9.75], "texture": "#0"},
              				"west": {"uv": [8, 4, 10.25, 5], "texture": "#0"},
              				"up": {"uv": [6.75, 10, 5.75, 7.75], "texture": "#0"},
              				"down": {"uv": [9, 5, 8, 7.25], "texture": "#0"}
              			}
              		},
              		{
              			"from": [12, 0, 2],
              			"to": [14, 2, 4],
              			"rotation": {"angle": 0, "axis": "y", "origin": [13, 1, 3]},
              			"faces": {
              				"north": {"uv": [9, 6, 9.5, 6.5], "texture": "#0"},
              				"east": {"uv": [9, 6.5, 9.5, 7], "texture": "#0"},
              				"south": {"uv": [9, 7, 9.5, 7.5], "texture": "#0"},
              				"west": {"uv": [9, 7.5, 9.5, 8], "texture": "#0"},
              				"up": {"uv": [9.5, 8.5, 9, 8], "texture": "#0"},
              				"down": {"uv": [9.5, 8.5, 9, 9], "texture": "#0"}
              			}
              		}
              	],
              	"display": {
              		"thirdperson_righthand": {
              			"translation": [3.5, 4, -1.5],
              			"scale": [0.7, 0.7, 0.7]
              		},
              		"thirdperson_lefthand": {
              			"translation": [3.5, 4, -1.5],
              			"scale": [0.7, 0.7, 0.7]
              		},
              		"firstperson_righthand": {
              			"translation": [3.5, 4, -1.5],
              			"scale": [0.7, 0.7, 0.7]
              		},
              		"firstperson_lefthand": {
              			"translation": [3.5, 4, -1.5],
              			"scale": [0.7, 0.7, 0.7]
              		},
              		"ground": {
              			"translation": [0, 1.5, 0],
              			"scale": [0.4, 0.4, 0.4]
              		},
              		"gui": {
              			"rotation": [20, -45, 0],
              			"translation": [0, 0.25, 0],
              			"scale": [0.6, 0.6, 0.6]
              		},
              		"fixed": {
              			"rotation": [0, 90, 0],
              			"translation": [0, 0, 0.75],
              			"scale": [0.6, 0.6, 0.6]
              		}
              	},
              	"groups": [
              		{
              			"name": "sofa",
              			"origin": [8, 8, 8],
              			"color": 0,
              			"children": [0, 1, 2, 3, 4, 5]
              		}
              	]
            }
            """;

    public static final String SOFA_NORMAL_CUSHION_MODEL = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [64, 64],
            	"textures": {
            		"0": "aestheticseating:block/sofa_COLOR_NAME_VALUE",
            		"particle": "aestheticseating:block/sofa_COLOR_NAME_VALUE"
            	},
            	"elements": [
            		{
            			"from": [1, 2, 1],
            			"to": [15, 7, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0, 4, 0]},
            			"faces": {
            				"north": {"uv": [3.5, 4, 7, 5.25], "texture": "#0"},
            				"east": {"uv": [3.5, 5.25, 7, 6.5], "texture": "#0"},
            				"south": {"uv": [3.5, 6.5, 7, 7.75], "texture": "#0"},
            				"west": {"uv": [0, 7, 3.5, 8.25], "texture": "#0"},
            				"up": {"uv": [3.5, 3.5, 0, 0], "texture": "#0"},
            				"down": {"uv": [3.5, 3.5, 0, 7], "texture": "#0"}
            			}
            		},
            		{
            			"from": [1, 7, 1],
            			"to": [15, 15, 5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 11, 3]},
            			"faces": {
            				"north": {"uv": [3.5, 0, 7, 2], "texture": "#0"},
            				"east": {"uv": [8, 7.25, 9, 9.25], "texture": "#0"},
            				"south": {"uv": [3.5, 2, 7, 4], "texture": "#0"},
            				"west": {"uv": [0, 8.25, 1, 10.25], "texture": "#0"},
            				"up": {"uv": [10.5, 1, 7, 0], "texture": "#0"},
            				"down": {"uv": [10.5, 1, 7, 2], "texture": "#0"}
            			}
            		},
            		{
            			"from": [5, 7, 5],
            			"to": [11, 13, 8],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 11, 7]},
            			"faces": {
            				"north": {"uv": [3.5, 0, 7, 2], "texture": "#0"},
            				"east": {"uv": [8, 7.25, 9, 9.25], "texture": "#0"},
            				"south": {"uv": [3.5, 2, 7, 4], "texture": "#0"},
            				"west": {"uv": [0, 8.25, 1, 10.25], "texture": "#0"},
            				"up": {"uv": [10.5, 1, 7, 0], "texture": "#0"},
            				"down": {"uv": [10.5, 1, 7, 2], "texture": "#0"}
            			}
            		},
            		{
            			"from": [1.25, 7, 5],
            			"to": [4.75, 10.5, 14],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3.25, 9, 9.5]},
            			"faces": {
            				"north": {"uv": [1, 8.25, 2, 9.25], "texture": "#0"},
            				"east": {"uv": [7, 2, 9.25, 3], "texture": "#0"},
            				"south": {"uv": [2, 8.25, 3, 9.25], "texture": "#0"},
            				"west": {"uv": [7, 3, 9.25, 4], "texture": "#0"},
            				"up": {"uv": [8, 6.25, 7, 4], "texture": "#0"},
            				"down": {"uv": [8, 6.25, 7, 8.5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [11.25, 7, 5],
            			"to": [14.75, 10.5, 14],
            			"rotation": {"angle": 0, "axis": "y", "origin": [12.75, 9, 9.5]},
            			"faces": {
            				"north": {"uv": [6.75, 8.5, 7.75, 9.5], "texture": "#0"},
            				"east": {"uv": [3.5, 7.75, 5.75, 8.75], "texture": "#0"},
            				"south": {"uv": [3, 8.75, 4, 9.75], "texture": "#0"},
            				"west": {"uv": [8, 4, 10.25, 5], "texture": "#0"},
            				"up": {"uv": [6.75, 10, 5.75, 7.75], "texture": "#0"},
            				"down": {"uv": [9, 5, 8, 7.25], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2, 0, 2],
            			"to": [4, 2, 4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 1, 3]},
            			"faces": {
            				"north": {"uv": [3, 8.25, 3.5, 8.75], "texture": "#0"},
            				"east": {"uv": [4, 8.75, 4.5, 9.25], "texture": "#0"},
            				"south": {"uv": [4.5, 8.75, 5, 9.25], "texture": "#0"},
            				"west": {"uv": [5, 8.75, 5.5, 9.25], "texture": "#0"},
            				"up": {"uv": [9.5, 5.5, 9, 5], "texture": "#0"},
            				"down": {"uv": [9.5, 5.5, 9, 6], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12, 0, 2],
            			"to": [14, 2, 4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 1, 3]},
            			"faces": {
            				"north": {"uv": [9, 6, 9.5, 6.5], "texture": "#0"},
            				"east": {"uv": [9, 6.5, 9.5, 7], "texture": "#0"},
            				"south": {"uv": [9, 7, 9.5, 7.5], "texture": "#0"},
            				"west": {"uv": [9, 7.5, 9.5, 8], "texture": "#0"},
            				"up": {"uv": [9.5, 8.5, 9, 8], "texture": "#0"},
            				"down": {"uv": [9.5, 8.5, 9, 9], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12, 0, 12],
            			"to": [14, 2, 14],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 1, 13]},
            			"faces": {
            				"north": {"uv": [9, 9, 9.5, 9.5], "texture": "#0"},
            				"east": {"uv": [1, 9.25, 1.5, 9.75], "texture": "#0"},
            				"south": {"uv": [1.5, 9.25, 2, 9.75], "texture": "#0"},
            				"west": {"uv": [2, 9.25, 2.5, 9.75], "texture": "#0"},
            				"up": {"uv": [9.75, 2.5, 9.25, 2], "texture": "#0"},
            				"down": {"uv": [3, 9.25, 2.5, 9.75], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2, 0, 12],
            			"to": [4, 2, 14],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 1, 13]},
            			"faces": {
            				"north": {"uv": [9.25, 2.5, 9.75, 3], "texture": "#0"},
            				"east": {"uv": [9.25, 3, 9.75, 3.5], "texture": "#0"},
            				"south": {"uv": [9.25, 3.5, 9.75, 4], "texture": "#0"},
            				"west": {"uv": [4, 9.25, 4.5, 9.75], "texture": "#0"},
            				"up": {"uv": [5, 9.75, 4.5, 9.25], "texture": "#0"},
            				"down": {"uv": [5.5, 9.25, 5, 9.75], "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [3.5, 4, -1.5],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"thirdperson_lefthand": {
            			"translation": [3.5, 4, -1.5],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_righthand": {
            			"translation": [3.5, 4, -1.5],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_lefthand": {
            			"translation": [3.5, 4, -1.5],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.4, 0.4, 0.4]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [0, 0.25, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"rotation": [0, 90, 0],
            			"translation": [0, 0, 0.75],
            			"scale": [0.6, 0.6, 0.6]
            		}
            	},
            	"groups": [
            		{
            			"name": "sofa",
            			"origin": [8, 8, 8],
            			"color": 0,
            			"children": [0, 1, 2, 3, 4, 5, 6, 7, 8]
            		}
            	]
            }
            """;

    public static final String SOFA_CENTER_CUSHION_MODEL = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [64, 64],
            	"textures": {
            		"0": "aestheticseating:block/sofa_COLOR_NAME_VALUE",
            		"particle": "aestheticseating:block/sofa_COLOR_NAME_VALUE"
            	},
            	"elements": [
            		{
            			"from": [0, 2, 1],
            			"to": [16, 7, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0, 4, 0]},
            			"faces": {
            				"north": {"uv": [3.5, 4, 7, 5.25], "texture": "#0"},
            				"east": {"uv": [3.5, 5.25, 7, 6.5], "texture": "#0"},
            				"south": {"uv": [3.5, 6.5, 7, 7.75], "texture": "#0"},
            				"west": {"uv": [0, 7, 3.5, 8.25], "texture": "#0"},
            				"up": {"uv": [3.5, 3.5, 0, 0], "texture": "#0"},
            				"down": {"uv": [3.5, 3.5, 0, 7], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 7, 1],
            			"to": [16, 15, 5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 11, 3]},
            			"faces": {
            				"north": {"uv": [3.5, 0, 7, 2], "texture": "#0"},
            				"east": {"uv": [8, 7.25, 9, 9.25], "texture": "#0"},
            				"south": {"uv": [3.5, 2, 7, 4], "texture": "#0"},
            				"west": {"uv": [0, 8.25, 1, 10.25], "texture": "#0"},
            				"up": {"uv": [10.5, 1, 7, 0], "texture": "#0"},
            				"down": {"uv": [10.5, 1, 7, 2], "texture": "#0"}
            			}
            		},
            		{
            			"from": [5, 7, 5],
            			"to": [11, 13, 8],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [8, 11, 7]},
            			"faces": {
            				"north": {"uv": [3.5, 0, 7, 2], "texture": "#0"},
            				"east": {"uv": [8, 7.25, 9, 9.25], "texture": "#0"},
            				"south": {"uv": [3.5, 2, 7, 4], "texture": "#0"},
            				"west": {"uv": [0, 8.25, 1, 10.25], "texture": "#0"},
            				"up": {"uv": [10.5, 1, 7, 0], "texture": "#0"},
            				"down": {"uv": [10.5, 1, 7, 2], "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [3.5, 4, -1.5],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"thirdperson_lefthand": {
            			"translation": [3.5, 4, -1.5],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_righthand": {
            			"translation": [3.5, 4, -1.5],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_lefthand": {
            			"translation": [3.5, 4, -1.5],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.4, 0.4, 0.4]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [0, 0.25, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"rotation": [0, 90, 0],
            			"translation": [0, 0, 0.75],
            			"scale": [0.6, 0.6, 0.6]
            		}
            	},
            	"groups": [
            		{
            			"name": "sofa",
            			"origin": [8, 8, 8],
            			"color": 0,
            			"children": [0, 1, 2]
            		}
            	]
            }
            """;

    public static final String SOFA_LEFT_CUSHION_MODEL = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [64, 64],
            	"textures": {
            		"0": "aestheticseating:block/sofa_COLOR_NAME_VALUE",
            		"particle": "aestheticseating:block/sofa_COLOR_NAME_VALUE"
            	},
            	"elements": [
            		{
            			"from": [0, 2, 1],
            			"to": [16, 7, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [-1, 4, 0]},
            			"faces": {
            				"north": {"uv": [3.5, 4, 7, 5.25], "texture": "#0"},
            				"east": {"uv": [3.5, 5.25, 7, 6.5], "texture": "#0"},
            				"south": {"uv": [3.5, 6.5, 7, 7.75], "texture": "#0"},
            				"west": {"uv": [0, 7, 3.5, 8.25], "texture": "#0"},
            				"up": {"uv": [3.5, 3.5, 0, 0], "texture": "#0"},
            				"down": {"uv": [3.5, 3.5, 0, 7], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 7, 1],
            			"to": [16, 15, 5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [7, 11, 3]},
            			"faces": {
            				"north": {"uv": [3.5, 0, 7, 2], "texture": "#0"},
            				"east": {"uv": [8, 7.25, 9, 9.25], "texture": "#0"},
            				"south": {"uv": [3.5, 2, 7, 4], "texture": "#0"},
            				"west": {"uv": [0, 8.25, 1, 10.25], "texture": "#0"},
            				"up": {"uv": [10.5, 1, 7, 0], "texture": "#0"},
            				"down": {"uv": [10.5, 1, 7, 2], "texture": "#0"}
            			}
            		},
            		{
            			"from": [6, 7, 5],
            			"to": [12, 13, 8],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [7, 11, 7]},
            			"faces": {
            				"north": {"uv": [3.5, 0, 7, 2], "texture": "#0"},
            				"east": {"uv": [8, 7.25, 9, 9.25], "texture": "#0"},
            				"south": {"uv": [3.5, 2, 7, 4], "texture": "#0"},
            				"west": {"uv": [0, 8.25, 1, 10.25], "texture": "#0"},
            				"up": {"uv": [10.5, 1, 7, 0], "texture": "#0"},
            				"down": {"uv": [10.5, 1, 7, 2], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0.25, 7, 5],
            			"to": [3.75, 10.5, 14],
            			"rotation": {"angle": 0, "axis": "y", "origin": [2.25, 9, 9.5]},
            			"faces": {
            				"north": {"uv": [1, 8.25, 2, 9.25], "texture": "#0"},
            				"east": {"uv": [7, 2, 9.25, 3], "texture": "#0"},
            				"south": {"uv": [2, 8.25, 3, 9.25], "texture": "#0"},
            				"west": {"uv": [7, 3, 9.25, 4], "texture": "#0"},
            				"up": {"uv": [8, 6.25, 7, 4], "texture": "#0"},
            				"down": {"uv": [8, 6.25, 7, 8.5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [1, 0, 2],
            			"to": [3, 2, 4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [2, 1, 3]},
            			"faces": {
            				"north": {"uv": [3, 8.25, 3.5, 8.75], "texture": "#0"},
            				"east": {"uv": [4, 8.75, 4.5, 9.25], "texture": "#0"},
            				"south": {"uv": [4.5, 8.75, 5, 9.25], "texture": "#0"},
            				"west": {"uv": [5, 8.75, 5.5, 9.25], "texture": "#0"},
            				"up": {"uv": [9.5, 5.5, 9, 5], "texture": "#0"},
            				"down": {"uv": [9.5, 5.5, 9, 6], "texture": "#0"}
            			}
            		},
            		{
            			"from": [1, 0, 12],
            			"to": [3, 2, 14],
            			"rotation": {"angle": 0, "axis": "y", "origin": [2, 1, 13]},
            			"faces": {
            				"north": {"uv": [9.25, 2.5, 9.75, 3], "texture": "#0"},
            				"east": {"uv": [9.25, 3, 9.75, 3.5], "texture": "#0"},
            				"south": {"uv": [9.25, 3.5, 9.75, 4], "texture": "#0"},
            				"west": {"uv": [4, 9.25, 4.5, 9.75], "texture": "#0"},
            				"up": {"uv": [5, 9.75, 4.5, 9.25], "texture": "#0"},
            				"down": {"uv": [5.5, 9.25, 5, 9.75], "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [3.5, 4, -1.5],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"thirdperson_lefthand": {
            			"translation": [3.5, 4, -1.5],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_righthand": {
            			"translation": [3.5, 4, -1.5],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_lefthand": {
            			"translation": [3.5, 4, -1.5],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.4, 0.4, 0.4]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [0, 0.25, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"rotation": [0, 90, 0],
            			"translation": [0, 0, 0.75],
            			"scale": [0.6, 0.6, 0.6]
            		}
            	},
            	"groups": [
            		{
            			"name": "sofa",
            			"origin": [8, 8, 8],
            			"color": 0,
            			"children": [0, 1, 2, 3, 4, 5]
            		}
            	]
            }
            """;

    public static final String SOFA_RIGHT_CUSHION_MODEL = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [64, 64],
            	"textures": {
            		"0": "aestheticseating:block/sofa_COLOR_NAME_VALUE",
            		"particle": "aestheticseating:block/sofa_COLOR_NAME_VALUE"
            	},
            	"elements": [
            		{
            			"from": [0, 2, 1],
            			"to": [16, 7, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1, 4, 0]},
            			"faces": {
            				"north": {"uv": [3.5, 4, 7, 5.25], "texture": "#0"},
            				"east": {"uv": [3.5, 5.25, 7, 6.5], "texture": "#0"},
            				"south": {"uv": [3.5, 6.5, 7, 7.75], "texture": "#0"},
            				"west": {"uv": [0, 7, 3.5, 8.25], "texture": "#0"},
            				"up": {"uv": [3.5, 3.5, 0, 0], "texture": "#0"},
            				"down": {"uv": [3.5, 3.5, 0, 7], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 7, 1],
            			"to": [16, 15, 5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [9, 11, 3]},
            			"faces": {
            				"north": {"uv": [3.5, 0, 7, 2], "texture": "#0"},
            				"east": {"uv": [8, 7.25, 9, 9.25], "texture": "#0"},
            				"south": {"uv": [3.5, 2, 7, 4], "texture": "#0"},
            				"west": {"uv": [0, 8.25, 1, 10.25], "texture": "#0"},
            				"up": {"uv": [10.5, 1, 7, 0], "texture": "#0"},
            				"down": {"uv": [10.5, 1, 7, 2], "texture": "#0"}
            			}
            		},
            		{
            			"from": [4, 7, 5],
            			"to": [10, 13, 8],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [10, 11, 7]},
            			"faces": {
            				"north": {"uv": [3.5, 0, 7, 2], "texture": "#0"},
            				"east": {"uv": [8, 7.25, 9, 9.25], "texture": "#0"},
            				"south": {"uv": [3.5, 2, 7, 4], "texture": "#0"},
            				"west": {"uv": [0, 8.25, 1, 10.25], "texture": "#0"},
            				"up": {"uv": [10.5, 1, 7, 0], "texture": "#0"},
            				"down": {"uv": [10.5, 1, 7, 2], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12.25, 7, 5],
            			"to": [15.75, 10.5, 14],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13.75, 9, 9.5]},
            			"faces": {
            				"north": {"uv": [6.75, 8.5, 7.75, 9.5], "texture": "#0"},
            				"east": {"uv": [3.5, 7.75, 5.75, 8.75], "texture": "#0"},
            				"south": {"uv": [3, 8.75, 4, 9.75], "texture": "#0"},
            				"west": {"uv": [8, 4, 10.25, 5], "texture": "#0"},
            				"up": {"uv": [6.75, 10, 5.75, 7.75], "texture": "#0"},
            				"down": {"uv": [9, 5, 8, 7.25], "texture": "#0"}
            			}
            		},
            		{
            			"from": [13, 0, 2],
            			"to": [15, 2, 4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [14, 1, 3]},
            			"faces": {
            				"north": {"uv": [9, 6, 9.5, 6.5], "texture": "#0"},
            				"east": {"uv": [9, 6.5, 9.5, 7], "texture": "#0"},
            				"south": {"uv": [9, 7, 9.5, 7.5], "texture": "#0"},
            				"west": {"uv": [9, 7.5, 9.5, 8], "texture": "#0"},
            				"up": {"uv": [9.5, 8.5, 9, 8], "texture": "#0"},
            				"down": {"uv": [9.5, 8.5, 9, 9], "texture": "#0"}
            			}
            		},
            		{
            			"from": [13, 0, 12],
            			"to": [15, 2, 14],
            			"rotation": {"angle": 0, "axis": "y", "origin": [14, 1, 13]},
            			"faces": {
            				"north": {"uv": [9, 9, 9.5, 9.5], "texture": "#0"},
            				"east": {"uv": [1, 9.25, 1.5, 9.75], "texture": "#0"},
            				"south": {"uv": [1.5, 9.25, 2, 9.75], "texture": "#0"},
            				"west": {"uv": [2, 9.25, 2.5, 9.75], "texture": "#0"},
            				"up": {"uv": [9.75, 2.5, 9.25, 2], "texture": "#0"},
            				"down": {"uv": [3, 9.25, 2.5, 9.75], "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [3.5, 4, -1.5],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"thirdperson_lefthand": {
            			"translation": [3.5, 4, -1.5],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_righthand": {
            			"translation": [3.5, 4, -1.5],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_lefthand": {
            			"translation": [3.5, 4, -1.5],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.4, 0.4, 0.4]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [0, 0.25, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"rotation": [0, 90, 0],
            			"translation": [0, 0, 0.75],
            			"scale": [0.6, 0.6, 0.6]
            		}
            	},
            	"groups": [
            		{
            			"name": "sofa",
            			"origin": [8, 8, 8],
            			"color": 0,
            			"children": [0, 1, 2, 3, 4, 5]
            		}
            	]
            }
            """;

    public static final String SOFA_LEFTCORNER_CUSHION_MODEL = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [64, 64],
            	"textures": {
            		"0": "aestheticseating:block/sofa_COLOR_NAME_VALUE",
            		"particle": "aestheticseating:block/sofa_COLOR_NAME_VALUE"
            	},
            	"elements": [
            		{
            			"from": [1, 2, 1],
            			"to": [15, 7, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0, 4, 0]},
            			"faces": {
            				"north": {"uv": [3.5, 4, 7, 5.25], "texture": "#0"},
            				"east": {"uv": [3.5, 5.25, 7, 6.5], "texture": "#0"},
            				"south": {"uv": [3.5, 6.5, 7, 7.75], "texture": "#0"},
            				"west": {"uv": [0, 7, 3.5, 8.25], "texture": "#0"},
            				"up": {"uv": [3.5, 3.5, 0, 0], "texture": "#0"},
            				"down": {"uv": [3.5, 3.5, 0, 7], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2, 2.0025, 1.001],
            			"to": [16, 6.9975, 15.002],
            			"rotation": {"angle": 0, "axis": "y", "origin": [1, 4, 0.1]},
            			"faces": {
            				"north": {"uv": [3.5, 4, 7, 5.25], "texture": "#0"},
            				"east": {"uv": [3.5, 5.25, 7, 6.5], "texture": "#0"},
            				"south": {"uv": [3.5, 6.5, 7, 7.75], "texture": "#0"},
            				"west": {"uv": [0, 7, 3.5, 8.25], "texture": "#0"},
            				"up": {"uv": [3.5, 3.5, 0, 0], "texture": "#0"},
            				"down": {"uv": [3.5, 3.5, 0, 7], "texture": "#0"}
            			}
            		},
            		{
            			"from": [1, 7, 1],
            			"to": [16, 15, 5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 11, 3]},
            			"faces": {
            				"north": {"uv": [3.5, 0, 7, 2], "texture": "#0"},
            				"east": {"uv": [8, 7.25, 9, 9.25], "texture": "#0"},
            				"south": {"uv": [3.5, 2, 7, 4], "texture": "#0"},
            				"west": {"uv": [0, 8.25, 1, 10.25], "texture": "#0"},
            				"up": {"uv": [10.5, 1, 7, 0], "texture": "#0"},
            				"down": {"uv": [10.5, 1, 7, 2], "texture": "#0"}
            			}
            		},
            		{
            			"from": [3, 7, 6],
            			"to": [11, 15.001, 10],
            			"rotation": {"angle": 45, "axis": "y", "origin": [5, 11, 8]},
            			"faces": {
            				"north": {"uv": [3.5, 0, 7, 2], "texture": "#0"},
            				"east": {"uv": [8, 7.25, 9, 9.25], "texture": "#0"},
            				"south": {"uv": [3.5, 2, 7, 4], "texture": "#0"},
            				"west": {"uv": [0, 8.25, 1, 10.25], "texture": "#0"},
            				"up": {"uv": [10.5, 1, 7, 0], "texture": "#0"},
            				"down": {"uv": [10.5, 1, 7, 2], "texture": "#0"}
            			}
            		},
            		{
            			"from": [1, 11, 5],
            			"to": [5, 15, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [2.95, 13.5, 9.5]},
            			"faces": {
            				"north": {"uv": [1, 8.25, 2, 9.25], "texture": "#0"},
            				"east": {"uv": [7, 2, 9.25, 3], "texture": "#0"},
            				"south": {"uv": [2, 8.25, 3, 9.25], "texture": "#0"},
            				"west": {"uv": [7, 3, 9.25, 4], "texture": "#0"},
            				"up": {"uv": [8, 6.25, 7, 4], "texture": "#0"},
            				"down": {"uv": [8, 6.25, 7, 8.5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [1, 7, 5],
            			"to": [5, 11, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [2.25, 9, 9.5]},
            			"faces": {
            				"north": {"uv": [6.75, 8.5, 7.75, 9.5], "texture": "#0"},
            				"east": {"uv": [3.5, 7.75, 5.75, 8.75], "texture": "#0"},
            				"south": {"uv": [3, 8.75, 4, 9.75], "texture": "#0"},
            				"west": {"uv": [8, 4, 10.25, 5], "texture": "#0"},
            				"up": {"uv": [6.75, 10, 5.75, 7.75], "texture": "#0"},
            				"down": {"uv": [9, 5, 8, 7.25], "texture": "#0"}
            			}
            		},
            		{
            			"from": [2, 0, 2],
            			"to": [4, 2, 4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [3, 1, 3]},
            			"faces": {
            				"north": {"uv": [3, 8.25, 3.5, 8.75], "texture": "#0"},
            				"east": {"uv": [4, 8.75, 4.5, 9.25], "texture": "#0"},
            				"south": {"uv": [4.5, 8.75, 5, 9.25], "texture": "#0"},
            				"west": {"uv": [5, 8.75, 5.5, 9.25], "texture": "#0"},
            				"up": {"uv": [9.5, 5.5, 9, 5], "texture": "#0"},
            				"down": {"uv": [9.5, 5.5, 9, 6], "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [3.5, 4, -1.5],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"thirdperson_lefthand": {
            			"translation": [3.5, 4, -1.5],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_righthand": {
            			"translation": [3.5, 4, -1.5],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_lefthand": {
            			"translation": [3.5, 4, -1.5],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.4, 0.4, 0.4]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [0, 0.25, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"rotation": [0, 90, 0],
            			"translation": [0, 0, 0.75],
            			"scale": [0.6, 0.6, 0.6]
            		}
            	},
            	"groups": [
            		{
            			"name": "sofa",
            			"origin": [8, 8, 8],
            			"color": 0,
            			"children": [0, 1, 2, 3, 4, 5, 6]
            		}
            	]
            }
            """;

    public static final String SOFA_RIGHTCORNER_CUSHION_MODEL = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [64, 64],
            	"textures": {
            		"0": "aestheticseating:block/sofa_COLOR_NAME_VALUE",
            		"particle": "aestheticseating:block/sofa_COLOR_NAME_VALUE"
            	},
            	"elements": [
            		{
            			"from": [1, 2, 1.001],
            			"to": [15, 7, 16.001],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0, 4, 0]},
            			"faces": {
            				"north": {"uv": [3.5, 4, 7, 5.25], "texture": "#0"},
            				"east": {"uv": [3.5, 5.25, 7, 6.5], "texture": "#0"},
            				"south": {"uv": [3.5, 6.5, 7, 7.75], "texture": "#0"},
            				"west": {"uv": [0, 7, 3.5, 8.25], "texture": "#0"},
            				"up": {"uv": [3.5, 3.5, 0, 0], "texture": "#0"},
            				"down": {"uv": [3.5, 3.5, 0, 7], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 2.0025, 1],
            			"to": [14, 6.9975, 15],
            			"rotation": {"angle": 0, "axis": "y", "origin": [-1, 4.1, 0]},
            			"faces": {
            				"north": {"uv": [3.5, 4, 7, 5.25], "texture": "#0"},
            				"east": {"uv": [3.5, 5.25, 7, 6.5], "texture": "#0"},
            				"south": {"uv": [3.5, 6.5, 7, 7.75], "texture": "#0"},
            				"west": {"uv": [0, 7, 3.5, 8.25], "texture": "#0"},
            				"up": {"uv": [3.5, 3.5, 0, 0], "texture": "#0"},
            				"down": {"uv": [3.5, 3.5, 0, 7], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 7, 1],
            			"to": [15, 15, 5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 11, 3]},
            			"faces": {
            				"north": {"uv": [3.5, 0, 7, 2], "texture": "#0"},
            				"east": {"uv": [8, 7.25, 9, 9.25], "texture": "#0"},
            				"south": {"uv": [3.5, 2, 7, 4], "texture": "#0"},
            				"west": {"uv": [0, 8.25, 1, 10.25], "texture": "#0"},
            				"up": {"uv": [10.5, 1, 7, 0], "texture": "#0"},
            				"down": {"uv": [10.5, 1, 7, 2], "texture": "#0"}
            			}
            		},
            		{
            			"from": [5.25, 7, 5.25],
            			"to": [13.25, 15.001, 9.25],
            			"rotation": {"angle": -45, "axis": "y", "origin": [10.25, 11, 7.25]},
            			"faces": {
            				"north": {"uv": [3.5, 0, 7, 2], "texture": "#0"},
            				"east": {"uv": [8, 7.25, 9, 9.25], "texture": "#0"},
            				"south": {"uv": [3.5, 2, 7, 4], "texture": "#0"},
            				"west": {"uv": [0, 8.25, 1, 10.25], "texture": "#0"},
            				"up": {"uv": [10.5, 1, 7, 0], "texture": "#0"},
            				"down": {"uv": [10.5, 1, 7, 2], "texture": "#0"}
            			}
            		},
            		{
            			"from": [11, 11, 5],
            			"to": [15, 15, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13.45, 13.5, 9.5]},
            			"faces": {
            				"north": {"uv": [1, 8.25, 2, 9.25], "texture": "#0"},
            				"east": {"uv": [7, 2, 9.25, 3], "texture": "#0"},
            				"south": {"uv": [2, 8.25, 3, 9.25], "texture": "#0"},
            				"west": {"uv": [7, 3, 9.25, 4], "texture": "#0"},
            				"up": {"uv": [8, 6.25, 7, 4], "texture": "#0"},
            				"down": {"uv": [8, 6.25, 7, 8.5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [11, 7, 5],
            			"to": [15, 11, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [12.75, 9, 9.5]},
            			"faces": {
            				"north": {"uv": [6.75, 8.5, 7.75, 9.5], "texture": "#0"},
            				"east": {"uv": [3.5, 7.75, 5.75, 8.75], "texture": "#0"},
            				"south": {"uv": [3, 8.75, 4, 9.75], "texture": "#0"},
            				"west": {"uv": [8, 4, 10.25, 5], "texture": "#0"},
            				"up": {"uv": [6.75, 10, 5.75, 7.75], "texture": "#0"},
            				"down": {"uv": [9, 5, 8, 7.25], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12, 0, 2],
            			"to": [14, 2, 4],
            			"rotation": {"angle": 0, "axis": "y", "origin": [13, 1, 3]},
            			"faces": {
            				"north": {"uv": [9, 6, 9.5, 6.5], "texture": "#0"},
            				"east": {"uv": [9, 6.5, 9.5, 7], "texture": "#0"},
            				"south": {"uv": [9, 7, 9.5, 7.5], "texture": "#0"},
            				"west": {"uv": [9, 7.5, 9.5, 8], "texture": "#0"},
            				"up": {"uv": [9.5, 8.5, 9, 8], "texture": "#0"},
            				"down": {"uv": [9.5, 8.5, 9, 9], "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [3.5, 4, -1.5],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"thirdperson_lefthand": {
            			"translation": [3.5, 4, -1.5],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_righthand": {
            			"translation": [3.5, 4, -1.5],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"firstperson_lefthand": {
            			"translation": [3.5, 4, -1.5],
            			"scale": [0.7, 0.7, 0.7]
            		},
            		"ground": {
            			"translation": [0, 1.5, 0],
            			"scale": [0.4, 0.4, 0.4]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [0, 0.25, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"rotation": [0, 90, 0],
            			"translation": [0, 0, 0.75],
            			"scale": [0.6, 0.6, 0.6]
            		}
            	},
            	"groups": [
            		{
            			"name": "sofa",
            			"origin": [8, 8, 8],
            			"color": 0,
            			"children": [0, 1, 2, 3, 4, 5, 6]
            		}
            	]
            }
            """;
}
