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
}
